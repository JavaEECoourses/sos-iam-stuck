package com.formationjee.sosiamstuck.repositories;

import com.formationjee.sosiamstuck.bo.Agenda;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AgendaRepository extends JpaRepository<Agenda, Integer> {
}
