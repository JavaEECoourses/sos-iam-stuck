package com.formationjee.sosiamstuck.dto;

import com.formationjee.sosiamstuck.bo.Adresse;
import com.formationjee.sosiamstuck.bo.Depanneur;
import com.formationjee.sosiamstuck.bo.Utilisateur;

public class DepanneurDto {

    public int idPersonne;
    public String nom;
    public String prenom;
    public String categorie;
    public String email;
    public String login;
    public String password;
    public String numeroTelephone;
    public AdresseDto adresse;
    public String pays;
    public String role;

    public DepanneurDto() {
    }

    public int getIdPersonne() {
        return idPersonne;
    }

    public void setIdPersonne(int idPersonne) {
        this.idPersonne = idPersonne;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNumeroTelephone() {
        return numeroTelephone;
    }

    public void setNumeroTelephone(String numeroTelephone) {
        this.numeroTelephone = numeroTelephone;
    }

    public AdresseDto getAdresse() {
        return adresse;
    }

    public String getPays() {
        return pays;
    }

    public void setPays(String pays) {
        this.pays = pays;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getCategorie() {
        return categorie;
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }

    public Depanneur convertToDepanneur(DepanneurDto depanneurDto) {
        Depanneur depanneur = new Depanneur();
        depanneur.setIdPersonne(depanneurDto.getIdPersonne());
        depanneur.setNom(depanneurDto.getNom());
        depanneur.setPrenom(depanneurDto.getPrenom());
        depanneur.setEmail(depanneurDto.getEmail());
        depanneur.setLogin(depanneurDto.getLogin());
        depanneur.setPassword(depanneurDto.getPassword());
        depanneur.setTelephone(depanneurDto.getNumeroTelephone());
        AdresseDto adresseDto = new AdresseDto();
        adresseDto.setCodePostal(depanneurDto.getAdresse().getCodePostal());
        adresseDto.setLibeleAdresse(depanneurDto.getAdresse().getLibeleAdresse());
        adresseDto.setVille(depanneurDto.getAdresse().getVille());
        adresseDto.setPays(depanneurDto.getAdresse().getPays());
        depanneur.setAdresse(adresseDto.convertToAdress(adresseDto));
        depanneur.setListIntervention(null);
        depanneur.setRating(0);
        depanneur.setRole(depanneurDto.getRole());
        depanneur.setCategorie(depanneurDto.getCategorie());
        return depanneur;
    }
}

