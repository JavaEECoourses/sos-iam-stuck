package com.formationjee.sosiamstuck.bo;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Agenda")
public class Agenda {

    @Id
    @GeneratedValue
    private int idAgenda;
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateDebut;
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateFin;
    @ManyToOne(fetch = FetchType.EAGER)
    private Depanneur depanneur;
    private int etat;

    public Agenda() {
    }

    public int getIdAgenda() {
        return idAgenda;
    }

    public void setIdAgenda(int idAgenda) {
        this.idAgenda = idAgenda;
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

    public int getEtat() {
        return etat;
    }

    public void setEtat(int etat) {
        this.etat = etat;
    }

    public Depanneur getDepanneur() {
        return depanneur;
    }

    public void setDepanneur(Depanneur depanneur) {
        this.depanneur = depanneur;
    }
}