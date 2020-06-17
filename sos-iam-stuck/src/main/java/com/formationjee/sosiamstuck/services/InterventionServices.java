package com.formationjee.sosiamstuck.services;

import com.formationjee.sosiamstuck.bo.Intervention;
import com.formationjee.sosiamstuck.repositories.InterventionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InterventionServices {

    @Autowired
    InterventionRepository interventionRepository;


    public Intervention addIntervention (Intervention inter){
        return interventionRepository.save(inter);
    }

    public Intervention getInterventionById(int idInterv){
        return interventionRepository.findById(idInterv).orElse(null);
    }

    public Intervention updateIntervention (Intervention newIntervention){
        Intervention intervention = getInterventionById(newIntervention.getIdIntervention());
        intervention.setDateDebut(newIntervention.getDateDebut());
        intervention.setDateFin(newIntervention.getDateFin());
        intervention.setDepanneur(newIntervention.getDepanneur());
        intervention.setDescription(newIntervention.getDescription());
        intervention.setReferenceIntervention(newIntervention.getReferenceIntervention());
        intervention.setStatut(newIntervention.getStatut());
        intervention.setUtilisateur(newIntervention.getUtilisateur());
        return interventionRepository.save(intervention);

    }

    public Intervention getInterventionByReference(int reference){
        return interventionRepository.findByReferenceIntervention(reference);
    }

    public List<Intervention> getListInterventionByNomAndPrenomDepanneur(String nom, String prenom){
        return null;
    }
}