package com.formationjee.sosiamstuck.repositories;

import com.formationjee.sosiamstuck.bo.Personne;
import com.formationjee.sosiamstuck.bo.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonneRepository extends JpaRepository <Personne , Integer>{
    Personne findByLoginAndPassword(String login , String password);
}
