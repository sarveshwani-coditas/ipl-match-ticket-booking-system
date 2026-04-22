package com.coditas.iplmatchticketbookingsystem.dto.stadium;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class StadiumRequest {


    private String name;

    private String location;

    private Integer capacity;
}
