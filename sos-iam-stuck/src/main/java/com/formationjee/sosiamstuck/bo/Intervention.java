package com.formationjee.sosiamstuck.bo;


import javax.persistence.*;
import java.util.Date;
@Entity
@Table(name = "Intervention")
public class Intervention {

    @Id
    @GeneratedValue
    private int idIntervention;

    @GeneratedValue
    private int referenceIntervention;
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateDebut;
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateFin;

    private String description;
    private String statut;
    @ManyToOne(fetch = FetchType.EAGER)
    private Depanneur depanneur;
    @ManyToOne(fetch = FetchType.EAGER)
    private Utilisateur utilisateur;


    public Intervention() {
    }

    public int getIdIntervention() {
        return idIntervention;
    }

    public void setIdIntervention(int idIntervention) {
        this.idIntervention = idIntervention;
    }

    public Date getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(Date dateDebut) {
        this.dateDebut = dateDebut;
    }

    public Date getDateFin() {
        return dateFin;
    }

    public void setDateFin(Date dateFin) {
        this.dateFin = dateFin;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStatut() {
        return statut;
    }

    public void setStatut(String statut) {
        this.statut = statut;
    }

    public Depanneur getDepanneur() {
        return depanneur;
    }

    public void setDepanneur(Depanneur depanneur) {
        this.depanneur = depanneur;
    }

    public Utilisateur getUtilisateur() {
        return utilisateur;
    }

    public void setUtilisateur(Utilisateur utilisateur) {
        this.utilisateur = utilisateur;
    }

    public int getReferenceIntervention() {
        return referenceIntervention;
    }

    public void setReferenceIntervention(int referenceIntervention) {
        this.referenceIntervention = referenceIntervention;
    }
}