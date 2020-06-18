package com.codegym.controller;

import com.codegym.model.DichVu;
import com.codegym.model.Service;
import com.codegym.service.DichVuService;
import com.codegym.service.KieuThueService;
import com.codegym.service.impl.DichVuServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.support.PagedListHolder;
import org.springframework.data.domain.*;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Controller
@SessionAttributes("servicelike")
public class DichVuController {
    @Autowired
    DichVuService dichVuService;
    @Autowired
    KieuThueService kieuThueService;

    @ModelAttribute("servicelike")
    public List<DichVu> dichVus() {
        return new ArrayList<>();
    }

    @RequestMapping("/service")
    public ModelAndView showService(Pageable pageable, @RequestParam("search") Optional<String> search) {
        ModelAndView modelAndView = new ModelAndView("service/servicelist");
        String key;
        Pageable pageable1SortByBlogId = PageRequest.of(pageable.getPageNumber(), 3, Sort.by("idService").descending());
        if (search.isPresent()) {
            key = search.get();
            Page<DichVu> dichVus = dichVuService.findByNameContaining(key, pageable1SortByBlogId);
            modelAndView.addObject("service", dichVus);
        } else {
            Page<DichVu> dichVus = dichVuService.findAll(pageable1SortByBlogId);
            modelAndView.addObject("service", dichVus);
        }
        return modelAndView;
    }

    @GetMapping("/service/create")
    public ModelAndView addNewService() {
        ModelAndView modelAndView = new ModelAndView("service/addservice");
        modelAndView.addObject("service", new DichVu());
        modelAndView.addObject("kieuthue", kieuThueService.findAll());
        return modelAndView;
    }

    @PostMapping("/service/create")
    public ModelAndView addNewService(@Valid @ModelAttribute("service") DichVu dichVu, BindingResult bindingResult, @PageableDefault(size = 3) Pageable pageable) {
        if (bindingResult.hasErrors()) {
            ModelAndView modelAndView = new ModelAndView("service/addservice");
            modelAndView.addObject("kieuthue", kieuThueService.findAll());
            return modelAndView;
        } else {
            ModelAndView modelAndView = new ModelAndView("service/servicelist");
            dichVuService.save(dichVu);
            modelAndView.addObject("service", dichVuService.findAll(pageable));
            return modelAndView;
        }
    }

    @GetMapping("/service/edit/{id}")
    public ModelAndView editService(@PathVariable Integer id) {
        ModelAndView modelAndView = new ModelAndView("service/editservice");
        DichVu dichVu = dichVuService.findById(id);
        modelAndView.addObject("service", dichVu);
        modelAndView.addObject("kieuthue", kieuThueService.findAll());
        return modelAndView;
    }

    @PostMapping("/service/edit")
    public ModelAndView editService(@Valid @ModelAttribute("service") DichVu dichVu, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            ModelAndView modelAndView = new ModelAndView("service/editservice");
            modelAndView.addObject("service", dichVu);
            modelAndView.addObject("kieuthue", kieuThueService.findAll());
            return modelAndView;
        } else {
            ModelAndView modelAndView = new ModelAndView("redirect:/service");
            dichVuService.save(dichVu);
            return modelAndView;
        }
    }

    @RequestMapping("service/delete/{id}")
    public String deleteService(@PathVariable Integer id) {
        dichVuService.remove(id);
        return "redirect:/service";
    }

    @RequestMapping("service/like/{id}")
    public String likeService(@PathVariable Integer id, @ModelAttribute("servicelike") List<DichVu> dichVus) {
        dichVus.add(dichVuService.findById(id));
        return "redirect:/service";
    }

    @RequestMapping("service/like")
    public ModelAndView listService(@PageableDefault(size = 3) Pageable pageable,@ModelAttribute("servicelike") List<DichVu> dichVus) {
        ModelAndView modelAndView = new ModelAndView("service/listlike");
        int startIndex = (int) pageable.getOffset();
        int endIndex = (int) ((pageable.getOffset() + pageable.getPageSize()) > dichVus.size() ?
                dichVus.size() :
                pageable.getOffset() + pageable.getPageSize());
        Page<DichVu> page = new PageImpl<>(dichVus.subList(startIndex, endIndex), pageable, dichVus.size());
        modelAndView.addObject("page", page);
        return modelAndView;
    }
}
