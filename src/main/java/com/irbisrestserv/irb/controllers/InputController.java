package com.irbisrestserv.irb.controllers;

import com.irbisrestserv.irb.models.Card;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/")
public class InputController {
    public static ArrayList<Card> reqs = new ArrayList<>();

    @PostMapping(value = "/", consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.CREATED)
    public void Request(@RequestBody ArrayList<Card> req){
        reqs.clear();
        for (Card item: req) {
            Card card = new Card(item.getName(), item.getInn());
            reqs.add(card);
        }
    }

    public static ArrayList getReq(){
        return reqs;
    }
}
//fetch("http://localhost:8080/", {method: "post", headers:{"Content-Type": "application/json"}, body: JSON.stringify([{"name": "1", "inn": "1"}, {"name": "2", "inn": "2"}, {"name": "3", "inn": "3"}])})