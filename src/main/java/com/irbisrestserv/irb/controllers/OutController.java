package com.irbisrestserv.irb.controllers;


import com.irbisrestserv.irb.repository.CardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class OutController {

    @Autowired
    CardRepository rep;

    @GetMapping("/out")
    public String outAll(Model model){
        rep.deleteByName(" ");
        model.addAttribute("reqs", rep.findAll());
        return "out";

    }

    @GetMapping("/out/result")
    public String outResult(Model model){
        model.addAttribute("reqs", rep.findByCustomQuery(MainController.getTerm(), PageRequest.of(0, 10)));
        return "out";

    }
}

