package com.formationjee.sosiamstuck.dto;

import com.formationjee.sosiamstuck.bo.Adresse;
import com.formationjee.sosiamstuck.bo.Utilisateur;

public class UtilisateurDto {

    public int idPersonne;
    public String nom;
    public String prenom ;
    public String email ;
    public String login ;
    public String password ;
    public String numeroTelephone;
    public AdresseDto adresse;
    public String role;

    public UtilisateurDto() {
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

    public void setAdresse(AdresseDto adresse) {
        this.adresse = adresse;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Utilisateur convertToUtilisateur(UtilisateurDto utilisateurDto){
        Utilisateur utilisateur = new Utilisateur();
        utilisateur.setIdPersonne(utilisateurDto.getIdPersonne());
        utilisateur.setNom(utilisateurDto.getNom());
        utilisateur.setPrenom(utilisateurDto.getPrenom());
        utilisateur.setEmail(utilisateurDto.getEmail());
        utilisateur.setLogin(utilisateurDto.getLogin());
        utilisateur.setPassword(utilisateurDto.getPassword());
        utilisateur.setTelephone(utilisateurDto.getNumeroTelephone());
        AdresseDto adresseDto = new AdresseDto();
        adresseDto.setCodePostal(utilisateurDto.getAdresse().getCodePostal());
        adresseDto.setLibeleAdresse(utilisateurDto.getAdresse().getLibeleAdresse());
        adresseDto.setVille(utilisateurDto.getAdresse().getVille());
        adresseDto.setPays(utilisateurDto.getAdresse().getPays());
        utilisateur.setAdresse(adresseDto.convertToAdress(adresseDto));
        utilisateur.setListIntervention(null);
        utilisateur.setRating(0);
        utilisateur.setRole(utilisateurDto.getRole());
        return utilisateur;
    }
}
