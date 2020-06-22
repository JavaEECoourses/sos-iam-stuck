package com.formationjee.sosiamstuck.controller;

import com.formationjee.sosiamstuck.bo.Utilisateur;
import com.formationjee.sosiamstuck.dto.UtilisateurDto;
import com.formationjee.sosiamstuck.services.UtilisateurServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
@CrossOrigin
@RestController
public class UtilisateurController {

    @Autowired
    UtilisateurServices utilisateurService;

    @PostMapping("/addUtilisateur")
    public Utilisateur addUtilisateur(@RequestBody UtilisateurDto utilisateurDto) {
        return utilisateurService.addUtilisateur(utilisateurDto.convertToUtilisateur(utilisateurDto));

    }

}
