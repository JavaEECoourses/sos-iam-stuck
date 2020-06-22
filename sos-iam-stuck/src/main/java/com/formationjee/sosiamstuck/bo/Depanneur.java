package com.formationjee.sosiamstuck.bo;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Depanneur")
public class Depanneur extends Personne{

    @OneToMany(mappedBy = "depanneur",fetch = FetchType.LAZY,
            cascade = CascadeType.ALL)
    private List<Intervention> listIntervention;

    @OneToMany(mappedBy = "depanneur",fetch = FetchType.EAGER,
            cascade = CascadeType.ALL )
    private List<Agenda> listAgendas;

    private String categorie;

    public Depanneur() {
    }

    public List<Intervention> getListIntervention() {
        return listIntervention;
    }

    public void setListIntervention(List<Intervention> listIntervention) {
        this.listIntervention = listIntervention;
    }

    public List<Agenda> getListAgendas() {
        return listAgendas;
    }

    public void setListAgendas(List<Agenda> listAgendas) {
        this.listAgendas = listAgendas;
    }

    public String getCategorie() {
        return categorie;
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }
}
