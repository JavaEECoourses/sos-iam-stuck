package com.formationjee.sosiamstuck.bo;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;


@Entity
@Table(name = "Adresse")
public class Adresse {

    @Id
    @GeneratedValue
    private int idAdresse;
    private String libeleAdresse;
    private String codePostale;
    private String ville;
    private String pays;
    @JsonIgnore
    @OneToOne(mappedBy = "adresse")
    private Personne personne;

    public Adresse(int idAdresse) {
        this.idAdresse = idAdresse;
    }

    public int getIdAdresse() {
        return idAdresse;
    }

    public void setIdAdresse(int idAdresse) {
        this.idAdresse = idAdresse;
    }

    public String getLibeleAdresse() {
        return libeleAdresse;
    }

    public void setLibeleAdresse(String libeleAdresse) {
        this.libeleAdresse = libeleAdresse;
    }

    public String getCodePostale() {
        return codePostale;
    }

    public void setCodePostale(String codePostale) {
        this.codePostale = codePostale;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getPays() {
        return pays;
    }

    public void setPays(String pays) {
        this.pays = pays;
    }

    public Personne getPersonne() {
        return personne;
    }

    public void setPersonne(Personne personne) {
        this.personne = personne;
    }

    public Adresse() {
    }
}
