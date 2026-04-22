package com.coditas.iplmatchticketbookingsystem.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "ticket_bookings")
public class TicketBookings {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "user_id")
    private Integer userId;

    @Column(name = "match_id")
    private Integer matchId;

    @Column(name = "number_of_seats")
    private Integer NumberOfSeats;

    @Column(name = "total_amount")
    private Integer TotalAmount;

}
