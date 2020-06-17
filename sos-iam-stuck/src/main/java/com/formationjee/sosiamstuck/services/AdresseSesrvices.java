package com.formationjee.sosiamstuck.services;

import com.formationjee.sosiamstuck.bo.Adresse;
import com.formationjee.sosiamstuck.repositories.AdresseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdresseSesrvices {

    @Autowired
    AdresseRepository adresseRepository;

    public Adresse addAdresse(Adresse adresse){
        return adresseRepository.save(adresse);
    }

    public Adresse getAdressByID(int id){
        return adresseRepository.findById(id).orElse(null);
    }

    public Adresse getAdresseByCodePostale(String codePostale){
        return adresseRepository.findByCodePostale(codePostale);
    }

    public List<Adresse> getAllAdresses(){
        return adresseRepository.findAll();
    }
}