package com.codegym.controller;


import com.codegym.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class UserController {
    @GetMapping("/")
    public String showUser(Model model, User user){
        model.addAttribute("user",user);
        return "index";
    }
    @PostMapping("/")
    public String OK(@Valid @ModelAttribute("user") User user, BindingResult bindingResult){
        if (bindingResult.hasFieldErrors()){
            return "index";
        }
        else {
            return "result";
        }
    }
}
