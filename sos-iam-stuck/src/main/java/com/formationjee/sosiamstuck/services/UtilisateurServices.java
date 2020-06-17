package com.formationjee.sosiamstuck.services;

import com.formationjee.sosiamstuck.bo.Utilisateur;
import com.formationjee.sosiamstuck.repositories.AdresseRepository;
import com.formationjee.sosiamstuck.repositories.UtilisateurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UtilisateurServices {
    @Autowired
    AdresseRepository adresseRepository;
    @Autowired
    UtilisateurRepository utilisateurRepository;

    public Utilisateur addUtilisateur(Utilisateur utilisateur){
        adresseRepository.save(utilisateur.getAdresse());
        adresseRepository.save(utilisateur.getAdresse());
        return utilisateurRepository.save(utilisateur);
    }

    public Utilisateur getUtilisateurById(Utilisateur u) {
        return utilisateurRepository.findById(u.getIdPersonne()).orElse(null);
    }
    public Utilisateur getUtilisateurByNom(Utilisateur u) {
        return utilisateurRepository.findByNom(u.getNom());
    }
}