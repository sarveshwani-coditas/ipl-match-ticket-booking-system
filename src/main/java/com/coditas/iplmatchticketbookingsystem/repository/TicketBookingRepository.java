package com.coditas.iplmatchticketbookingsystem.repository;

import com.coditas.iplmatchticketbookingsystem.entity.TicketBookings;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TicketBookingRepository extends JpaRepository<TicketBookings, Integer> {
}
