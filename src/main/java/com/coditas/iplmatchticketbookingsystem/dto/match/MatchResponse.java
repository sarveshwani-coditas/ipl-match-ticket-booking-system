package com.coditas.iplmatchticketbookingsystem.dto.match;

import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@Builder
@NoArgsConstructor
public class MatchResponse {

    private Integer id;

    private String matchDate;

    private String stadiumName;

    private String teamA;

    private String teamB;

    private Integer ticketPrice;
}
