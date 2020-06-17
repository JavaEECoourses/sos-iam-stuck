package com.formationjee.sosiamstuck.repositories;

import com.formationjee.sosiamstuck.bo.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface UtilisateurRepository extends JpaRepository<Utilisateur, Integer> {
    Utilisateur findByNom(String nom);
}
