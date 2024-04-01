package com.cricket.cricbackend.controllers;

import com.cricket.cricbackend.entities.Match;
import com.cricket.cricbackend.services.CricketService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("cricket")
public class MainController {
    private CricketService cricketService;

    public MainController(CricketService cricketService) {
        this.cricketService = cricketService;
    }

    @GetMapping("live")
    public ResponseEntity<?> getLiveMatchScores() throws InterruptedException{
        System.out.println("Getting live match");
        return new ResponseEntity<>(this.cricketService.getLiveMatchScores(), HttpStatus.OK);
    }

    @GetMapping("point-table")
    public ResponseEntity<?> getIPLPointTable(){
        return new ResponseEntity<>(this.cricketService.getPointTable(), HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<Match>> getAllMatches(){
        return new ResponseEntity<>(this.cricketService.getALlMatches(), HttpStatus.OK);
    }
}
