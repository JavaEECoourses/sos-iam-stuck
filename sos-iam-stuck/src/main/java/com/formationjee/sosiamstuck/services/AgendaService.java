package com.formationjee.sosiamstuck.services;

import com.formationjee.sosiamstuck.bo.Agenda;
import com.formationjee.sosiamstuck.repositories.AgendaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AgendaService {
    @Autowired
    AgendaRepository agendaRepository;

    public Agenda getAgendaById(int  id){
        return agendaRepository.findById(id).orElse(null);
    }

    public Agenda addAgenda(Agenda ag){
        return agendaRepository.save(ag);
    }
    public List<Agenda> getAllAgendas(){return agendaRepository.findAll(); }
    public Agenda getAgendaByIdDepanneur(String idDepanneur){
        return null;
    }
}