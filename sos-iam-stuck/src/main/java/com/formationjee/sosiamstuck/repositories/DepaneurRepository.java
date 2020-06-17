package com.formationjee.sosiamstuck.repositories;

import com.formationjee.sosiamstuck.bo.Depanneur;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepaneurRepository  extends JpaRepository<Depanneur, Integer> {
    Depanneur findByNom(String nom);

}
