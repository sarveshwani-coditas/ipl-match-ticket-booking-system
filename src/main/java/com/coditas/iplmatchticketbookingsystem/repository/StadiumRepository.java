package com.coditas.iplmatchticketbookingsystem.repository;

import com.coditas.iplmatchticketbookingsystem.entity.Match;
import com.coditas.iplmatchticketbookingsystem.entity.Stadium;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StadiumRepository extends JpaRepository<Stadium, Integer> {



}
