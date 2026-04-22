package com.coditas.iplmatchticketbookingsystem.service;

import com.coditas.iplmatchticketbookingsystem.dto.stadium.StadiumRequest;
import com.coditas.iplmatchticketbookingsystem.dto.stadium.StadiumResponse;
import com.coditas.iplmatchticketbookingsystem.entity.Stadium;
import com.coditas.iplmatchticketbookingsystem.repository.StadiumRepository;
import org.springframework.stereotype.Service;

@Service
public class StadiumService {

    private StadiumRepository stadiumRepository;

    public StadiumService(StadiumRepository stadiumRepository){
        this.stadiumRepository= stadiumRepository;
    }


    public StadiumResponse createStadium(StadiumRequest request) {

        Stadium stadium = new Stadium();

        stadium.setName(request.getName());
        stadium.setCapacity(request.getCapacity());
        stadium.setLocation(request.getLocation());

        Stadium savedStadium = stadiumRepository.save(stadium);

        return StadiumResponse.builder()
                .id(savedStadium.getId())
                .name(savedStadium.getName())
                .capacity(savedStadium.getCapacity())
                .location(savedStadium.getLocation())
                .build();
    }
}
