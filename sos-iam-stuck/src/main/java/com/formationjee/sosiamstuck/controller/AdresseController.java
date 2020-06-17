package com.formationjee.sosiamstuck.controller;

import com.formationjee.sosiamstuck.bo.Adresse;
import com.formationjee.sosiamstuck.services.AdresseSesrvices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AdresseController {
    @Autowired
    AdresseSesrvices adresseSesrvices;

    @PostMapping("/addAdresse")
    public Adresse addAdresse(@RequestBody Adresse adresse){
        return adresseSesrvices.addAdresse(adresse);
    }

    @GetMapping("/allAdresses")
    public List<Adresse> getAllAdresses(){
        return adresseSesrvices.getAllAdresses();
    }

    @GetMapping("/getAdresseByCodePostale")
    public Adresse getAdresseByCodePostale(@PathVariable String codePostale){
        return adresseSesrvices.getAdresseByCodePostale(codePostale);
    }
}