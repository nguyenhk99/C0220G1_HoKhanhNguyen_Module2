package com.codegym.controller;

import com.codegym.model.HopDongChiTiet;
import com.codegym.service.DichVuDiKemService;
import com.codegym.service.HopDongChiTietService;
import com.codegym.service.HopDongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HopDongChiTietController {
    @Autowired
    HopDongChiTietService hopDongChiTietService;
    @Autowired
    HopDongService hopDongService;
    @Autowired
    DichVuDiKemService dichVuDiKemService;

    @GetMapping("/details")
    public ModelAndView detaillist(@PageableDefault(size = 3) Pageable pageable) {
        ModelAndView modelAndView = new ModelAndView("details/detaillist");
        modelAndView.addObject("details", hopDongChiTietService.findAll(pageable));
        return modelAndView;
    }

    @GetMapping("/details/create")
    public ModelAndView createNewDetails(Pageable pageable) {
        ModelAndView modelAndView = new ModelAndView("details/adddetails");
        modelAndView.addObject("details", new HopDongChiTiet());
        modelAndView.addObject("contract", hopDongService.findAll(pageable));
        modelAndView.addObject("accompaniedService", dichVuDiKemService.findAll(pageable));
        return modelAndView;
    }

    @PostMapping("/details/create")
    public ModelAndView createNewDetails(@ModelAttribute("details") HopDongChiTiet hopDongChiTiet, @PageableDefault(size = 3) Pageable pageable) {
        hopDongChiTietService.save(hopDongChiTiet);
        ModelAndView modelAndView = new ModelAndView("details/detaillist");
        modelAndView.addObject("details", hopDongChiTietService.findAll(pageable));
        return modelAndView;
    }
}
