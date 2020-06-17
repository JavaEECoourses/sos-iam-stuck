package com.formationjee.sosiamstuck.services;

import com.formationjee.sosiamstuck.bo.Personne;
import com.formationjee.sosiamstuck.bo.Utilisateur;
import com.formationjee.sosiamstuck.repositories.PersonneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonneService {

    @Autowired
    PersonneRepository personneRepository;



    public Personne getPersonneByLoginandPassword(Personne p){
        return personneRepository.findByLoginAndPassword(p.getLogin(),p.getPassword());
    }
}
