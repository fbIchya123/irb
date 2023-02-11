package com.irbisrestserv.irb.controllers;

import com.irbisrestserv.irb.models.Card;
import com.irbisrestserv.irb.repository.CardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import java.util.ArrayList;


@RestController
public class FindController {

    @Autowired
    private CardRepository rep;


    @PostConstruct
    @PostMapping("/out")
    public void addCard(){
        ArrayList<Card> cards = new ArrayList<>(InputController.getReq());
        cards.add(new Card("t", ""));
        rep.saveAll(cards);
        rep.deleteByName("t");
    }

    @GetMapping("/allCard")
    public Iterable<Card> getCards(){
        return rep.findAll();
    }

    @GetMapping("/FoundCards/{name}")
    public Iterable<Card> getCardByName(@PathVariable String name){
        Page<Card> result = rep.findByCustomQuery(name, PageRequest.of(0, 10));
        return result;
    }

}
