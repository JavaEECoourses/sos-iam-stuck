package com.formationjee.sosiamstuck.controller;

import com.formationjee.sosiamstuck.bo.Utilisateur;
import com.formationjee.sosiamstuck.services.UtilisateurServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UtilisateurController {

    @Autowired
    UtilisateurServices utilisateurService;

    @PostMapping("/addUtilisateur")
    public Utilisateur addUtilisateur(@RequestBody Utilisateur utilisateur) {
        return utilisateurService.addUtilisateur(utilisateur);

    }

}