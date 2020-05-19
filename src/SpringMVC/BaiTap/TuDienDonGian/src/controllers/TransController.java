package controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import service.Translate;

import java.util.ArrayList;
import java.util.List;

@Controller
public class TransController {
    @Autowired
    Translate translate;

    @GetMapping("/trans")
    public String abc(@RequestParam String eng, Model model){
        String string = translate.translate(eng);
        model.addAttribute("string",string);
        return "view";
    }
}
