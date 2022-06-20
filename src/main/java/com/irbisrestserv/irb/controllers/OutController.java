package com.irbisrestserv.irb.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class OutController {

    @GetMapping("/out")
    public String out(Model model){
        //Iterable<CardRequest> reqs = cardRequestRepository.findAll();
        model.addAttribute("reqs", RequestController.getReq());
        return "out";
    }

}

