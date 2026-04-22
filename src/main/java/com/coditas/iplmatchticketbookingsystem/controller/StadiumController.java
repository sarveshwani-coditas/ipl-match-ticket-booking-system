package com.coditas.iplmatchticketbookingsystem.controller;

import com.coditas.iplmatchticketbookingsystem.dto.stadium.StadiumRequest;
import com.coditas.iplmatchticketbookingsystem.dto.stadium.StadiumResponse;
import com.coditas.iplmatchticketbookingsystem.service.StadiumService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1")
public class StadiumController {

    private StadiumService stadiumService;

    public StadiumController(StadiumService stadiumService){
        this.stadiumService=stadiumService;
    }

    @PostMapping("/stadiums")
    public ResponseEntity<StadiumResponse> createStadium(@RequestBody StadiumRequest request){

        StadiumResponse stadium = stadiumService.createStadium(request);
        return ResponseEntity.status(HttpStatus.CREATED).body(stadium);
    }
}
