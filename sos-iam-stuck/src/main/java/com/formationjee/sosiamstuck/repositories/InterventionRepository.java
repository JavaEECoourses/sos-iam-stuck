package com.formationjee.sosiamstuck.repositories;

import com.formationjee.sosiamstuck.bo.Intervention;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface InterventionRepository extends JpaRepository<Intervention, Integer> {

    Intervention findByReferenceIntervention(int reference);
   // List<Intervention> getListInterventionByNomAndPrenomDepanneur(String nom, String prenom);
}
