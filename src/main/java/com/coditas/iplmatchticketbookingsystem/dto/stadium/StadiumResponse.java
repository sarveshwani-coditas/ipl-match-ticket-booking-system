package com.coditas.iplmatchticketbookingsystem.dto.stadium;

import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@Builder
@NoArgsConstructor
public class StadiumResponse {

    private Integer id;

    private String name;

    private String location;

    private Integer capacity;
}
