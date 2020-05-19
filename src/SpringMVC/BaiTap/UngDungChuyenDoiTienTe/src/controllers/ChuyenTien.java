package controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ChuyenTien {

    @Autowired
    service.ChuyenTien chuyenTien;

    @GetMapping("/chuyentien")
    public String chuyentien(@RequestParam String vnd, Model model){
        double usd = Double.parseDouble(vnd);
        Double result = chuyenTien.chuyenDoi(usd);
        model.addAttribute("result", result);
        return "view";
    }
}
