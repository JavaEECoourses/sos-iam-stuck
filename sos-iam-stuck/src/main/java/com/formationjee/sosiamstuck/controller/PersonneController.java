package com.formationjee.sosiamstuck.controller;
import com.formationjee.sosiamstuck.bo.Personne;
import com.formationjee.sosiamstuck.services.PersonneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class PersonneController {

    @Autowired
    PersonneService personneService;

    @PostMapping("/authentification")
    public Personne getPersonneByLoginAndPassword(@RequestParam(value = "login") String login , @RequestParam(value = "password") String password){
        return personneService.getPersonneByLoginandPassword(login,password);
    }
}
