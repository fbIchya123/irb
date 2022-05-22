package com.irbisrestserv.irb.controllers;

import com.irbisrestserv.irb.models.Card;
import com.irbisrestserv.irb.repo.CardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SearchController {

    @Autowired
    private CardRepository cardRepository;

    @GetMapping("/search")
    public String search(Model model){
        Iterable<Card> cards = cardRepository.findAll();
        model.addAttribute("cards", cards);
        return "search";
    }
}
