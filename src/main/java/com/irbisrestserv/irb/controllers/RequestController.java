package com.irbisrestserv.irb.controllers;



import com.irbisrestserv.irb.repo.CardRequestRepository;
import com.irbisrestserv.irb.models.CardRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/")
public class RequestController {
    public static ArrayList<CardRequest> reqs = new ArrayList<CardRequest>();

    @PostMapping(value = "/", consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.CREATED)
    public void Request(@RequestBody ArrayList<CardRequest> req){
        for (CardRequest item: req) {
            CardRequest card = new CardRequest();
            card.setInn(item.getInn()); 
            card.setName(item.getName());
            reqs.add(card);
        }
    }

    public static ArrayList getReq(){
        return reqs;
    }


}
//fetch("http://localhost:8080/", {method: "post", headers:{"Content-Type": "application/json"}, body: JSON.stringify([{"name": "name", "inn": "inn"}, {"name": "name", "inn": "inn"}, {"name": "name", "inn": "inn"}])})