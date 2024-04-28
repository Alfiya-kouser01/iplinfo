package com.cricket.iplinfo.controller;

import com.cricket.iplinfo.entity.Match;
import com.cricket.iplinfo.service.MatchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/match")
public class MatchController {

    @Autowired
    private MatchService matchService;

    // get live matches
    @GetMapping("/live")
    public ResponseEntity<List<Match>> getLiveMatches() {
        return new ResponseEntity<>(matchService.getLiveMatches(), HttpStatus.OK);
    }

    // get all matches stored in database

    @GetMapping("/all")
    public ResponseEntity<List<Match>> getAllMatches(){
        return new ResponseEntity<>(this.matchService.getAllMatches(), HttpStatus.OK);
    }

 // get point table

    @GetMapping("/pointTable")

    public ResponseEntity<?> getpointTable(){
        return new ResponseEntity<>(this.matchService.getpointTable(),HttpStatus.OK);
    }
}
