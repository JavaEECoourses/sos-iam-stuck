package com.formationjee.sosiamstuck.controller;

import com.formationjee.sosiamstuck.bo.Agenda;
import com.formationjee.sosiamstuck.repositories.AgendaRepository;
import com.formationjee.sosiamstuck.services.AgendaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AgendaController {

    @Autowired
    AgendaService agendaService;

    @PostMapping("/addAgenda")
    public Agenda addAgenda(@RequestBody Agenda agenda){
        return agendaService.addAgenda(agenda);
    }

    @GetMapping("/allAgandas")
    public List<Agenda> getAllAgendas(){
        return agendaService.getAllAgendas();
    }
}