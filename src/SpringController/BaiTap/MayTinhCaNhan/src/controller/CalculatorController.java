package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import service.Calculator;

@Controller
public class CalculatorController {

    @Autowired
    Calculator calculator;

    @RequestMapping("/calculator")
    public String dsa(@RequestParam("button") String button, @RequestParam double num1, @RequestParam double num2, ModelMap modelMap) {
        double result = calculator.calculator(button,num1,num2);
        modelMap.addAttribute("result", result);
        return "index";
    }
}
