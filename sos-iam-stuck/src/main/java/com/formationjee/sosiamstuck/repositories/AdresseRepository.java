package com.formationjee.sosiamstuck.repositories;

import com.formationjee.sosiamstuck.bo.Adresse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdresseRepository extends JpaRepository<Adresse, Integer> {
    Adresse findByCodePostale(String codePostale);
}
