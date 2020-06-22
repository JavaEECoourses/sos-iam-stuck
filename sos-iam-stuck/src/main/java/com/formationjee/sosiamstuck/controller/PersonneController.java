package com.formationjee.sosiamstuck.controller;
import com.formationjee.sosiamstuck.bo.Personne;
import com.formationjee.sosiamstuck.dto.PersonneDto;
import com.formationjee.sosiamstuck.services.PersonneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
public class PersonneController {

    @Autowired
    PersonneService personneService;

    @PostMapping("/authentification")
    public Personne getPersonneByLoginAndPassword(@RequestBody PersonneDto personneDto){
        return personneService.getPersonneByLoginandPassword(personneDto.getLogin(),personneDto.getPassword());
    }
}
