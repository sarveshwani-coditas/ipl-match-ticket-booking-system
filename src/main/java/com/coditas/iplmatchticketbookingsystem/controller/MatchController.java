package com.coditas.iplmatchticketbookingsystem.controller;

import com.coditas.iplmatchticketbookingsystem.dto.match.MatchRequest;
import com.coditas.iplmatchticketbookingsystem.dto.match.MatchResponse;
import com.coditas.iplmatchticketbookingsystem.dto.ticketbooking.TicketBookingResponse;
import com.coditas.iplmatchticketbookingsystem.entity.Match;
import com.coditas.iplmatchticketbookingsystem.service.MatchService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1")
public class MatchController {

    private MatchService matchService;

    public MatchController(MatchService matchService) {
        this.matchService = matchService;
    }

    @PostMapping("/matches")
    public ResponseEntity<MatchResponse> createMatch(@RequestBody MatchRequest request) {
        MatchResponse response = matchService.createMatch(request);
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }

    @PutMapping("/matches/{mid}")
    public ResponseEntity<MatchResponse> updateMatch(@PathVariable int mid, @RequestBody MatchRequest request) {
        MatchResponse response = matchService.updateMatch(mid, request);
        return ResponseEntity.status(HttpStatus.OK).body(response);
    }

    @DeleteMapping("/matches/{mid}")
    public ResponseEntity<String> deleteMatch(@PathVariable int mid) {
        String response = matchService.deleteMatch(mid);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).body(response);
    }

    @GetMapping("/matches")
    public ResponseEntity<List<Match>> getAllMatches() {
        List<Match> response = matchService.getAllMatches();
        return ResponseEntity.status(HttpStatus.OK).body(response);
    }


    @GetMapping("/matches/{mid}")
    public ResponseEntity<MatchResponse> getMatch(@PathVariable int mid) {
        MatchResponse response = matchService.getMatchById(mid);
        return ResponseEntity.status(HttpStatus.OK).body(response);
    }

    @PostMapping("/tickets/{uid}/{mid}/{seats}")
    public ResponseEntity<TicketBookingResponse> ticketBooking(@PathVariable int uid, @PathVariable int mid, @PathVariable int seats) {
        TicketBookingResponse response = matchService.ticketBooking(uid, mid, seats);
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }






}
