package com.codegym.controller;

import com.codegym.model.HopDong;
import com.codegym.model.KhachHang;
import com.codegym.repository.HopDongRepository;
import com.codegym.service.DichVuService;
import com.codegym.service.HopDongService;
import com.codegym.service.KhachHangService;
import com.codegym.service.NhanVienService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;
import java.text.ParseException;
import java.util.Date;
import java.util.List;

@Controller
public class HopDongController {
    @Autowired
    HopDongService hopDongService;
    @Autowired
    NhanVienService nhanVienService;
    @Autowired
    KhachHangService khachHangService;
    @Autowired
    DichVuService dichVuService;

    @RequestMapping("/contract")
    public ModelAndView contractlist(@PageableDefault(size = 3)Pageable pageable){
        ModelAndView modelAndView = new ModelAndView("contract/contractlist");
        modelAndView.addObject("contract",hopDongService.findAll(pageable));
        return modelAndView;
    }

    @GetMapping("/contract/create")
    public ModelAndView addNewContract(Pageable pageable){
        ModelAndView modelAndView = new ModelAndView("contract/addcontract");
        modelAndView.addObject("contract",new HopDong());
        modelAndView.addObject("employee",nhanVienService.findAll(pageable));
        modelAndView.addObject("customer",khachHangService.findAll(pageable));
        modelAndView.addObject("service",dichVuService.findAll(pageable));
        return modelAndView;
    }

    @PostMapping("/contract/create")
    public ModelAndView addNewContract( @Valid @ModelAttribute("contract") HopDong hopDong, BindingResult bindingResult, @PageableDefault(size = 3)Pageable pageable, HttpServletResponse response){
        if(bindingResult.hasErrors()){
            ModelAndView modelAndView = new ModelAndView("contract/addcontract");
            modelAndView.addObject("employee",nhanVienService.findAll(pageable));
            modelAndView.addObject("customer",khachHangService.findAll(pageable));
            modelAndView.addObject("service",dichVuService.findAll(pageable));
            return modelAndView;
        }else {
            hopDongService.save(hopDong);
            response.addCookie(new Cookie("service",dichVuService.findById(hopDong.getDichvu().getIdService()).getName()));
            ModelAndView modelAndView = new ModelAndView("contract/contractlist");
            modelAndView.addObject("contract", hopDongService.findAll(pageable));
            return modelAndView;
        }

    }

    @RequestMapping("/contract/customerusingservice")
    public ModelAndView customerusingservice(Pageable pageable) throws ParseException {
        Date date = new Date();
        Page<HopDong> hopDongs = hopDongService.findAllByDateEnd(date, pageable);
        ModelAndView modelAndView = new ModelAndView("contract/customerusingservice");
        modelAndView.addObject("contractservice",hopDongs);
        return modelAndView;
    }
}
