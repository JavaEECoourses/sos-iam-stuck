package com.formationjee.sosiamstuck.controller;

import com.formationjee.sosiamstuck.bo.Personne;
import com.formationjee.sosiamstuck.services.PersonneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonneController {

    @Autowired
    PersonneService personneService;

    @PostMapping("/authentification")
    public Personne getPersonneByLoginAndPassword(@RequestBody Personne personne){
        return personneService.getPersonneByLoginandPassword(personne);
    }
}
