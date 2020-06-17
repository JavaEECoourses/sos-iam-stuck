package com.formationjee.sosiamstuck.services;

import com.formationjee.sosiamstuck.bo.Depanneur;
import com.formationjee.sosiamstuck.repositories.AdresseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.formationjee.sosiamstuck.repositories.DepaneurRepository;

import java.util.List;
import java.util.Optional;

@Service
public class DepanneurServices {

    @Autowired
    DepaneurRepository depaneurRepository;
    @Autowired
    AdresseRepository adresseRepository;

    public Depanneur saveDepanneur(Depanneur d){

        adresseRepository.save(d.getAdresse());
        return depaneurRepository.save(d);
    }
    public List<Depanneur> getAllDepanneur(){
        return depaneurRepository.findAll();
    }

    public Depanneur getDepanneurByNom(String nom){
        return depaneurRepository.findByNom(nom);
    }

    public Optional<Depanneur> getDepanneurById(int id){
        return depaneurRepository.findById(id);
    }

    public Depanneur updateDepanneur(Depanneur dep){
        Depanneur existingDepanneur = getDepanneurById(dep.getIdPersonne()).orElse(null);
        existingDepanneur.setCategorie(dep.getCategorie());

        existingDepanneur.setEmail(dep.getEmail());
        existingDepanneur.setNom(dep.getNom());
        existingDepanneur.setPrenom(dep.getPrenom());
        existingDepanneur.setRating(dep.getRating());
        existingDepanneur.setTelephone(dep.getTelephone());
        return depaneurRepository.save(existingDepanneur);
    }
}