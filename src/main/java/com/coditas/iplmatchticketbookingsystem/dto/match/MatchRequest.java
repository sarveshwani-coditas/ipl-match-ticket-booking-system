package com.coditas.iplmatchticketbookingsystem.dto.match;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class MatchRequest {

    private String matchDate;

    private Integer stadium_id;

    private String teamA;

    private String teamB;

    private Integer ticketPrice;

}
