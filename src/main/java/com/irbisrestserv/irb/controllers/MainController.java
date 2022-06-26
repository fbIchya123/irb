package com.irbisrestserv.irb.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {
    public static String term;

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("title", "Main Page");
        return "home";
    }

    @PostMapping("/")
    public String getTerm(@RequestParam String newTerm, Model model){
        term = newTerm;
        return "redirect:/out/result";
    }

    public static String getTerm(){
        return term;
    }

}