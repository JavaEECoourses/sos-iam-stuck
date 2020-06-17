package com.formationjee.sosiamstuck.controller;

import com.formationjee.sosiamstuck.bo.Intervention;
import com.formationjee.sosiamstuck.services.InterventionServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class InterventionController {

    @Autowired
    InterventionServices interventionServices;

    @PostMapping("/addIntervention")
    public Intervention addIntervention(@RequestBody Intervention intervention){
       return  interventionServices.addIntervention(intervention);
    }
}