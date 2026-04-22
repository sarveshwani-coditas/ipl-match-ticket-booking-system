package com.coditas.iplmatchticketbookingsystem.dto.ticketbooking;

import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@Builder
@NoArgsConstructor
public class TicketBookingResponse {

    private Integer id;

    private String name;

    private String match;

    private Integer NumberOfSeats;

    private Integer TotalAmount;
}
