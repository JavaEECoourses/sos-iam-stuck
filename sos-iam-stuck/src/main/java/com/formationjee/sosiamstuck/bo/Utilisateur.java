package com.formationjee.sosiamstuck.bo;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Utilisateur")
public class Utilisateur extends Personne{

    @OneToMany(mappedBy = "utilisateur",fetch = FetchType.LAZY,
            cascade = CascadeType.ALL)
    private List<Intervention> listIntervention;

    public List<Intervention> getListIntervention() {
        return listIntervention;
    }

    public void setListIntervention(List<Intervention> listIntervention) {
        this.listIntervention = listIntervention;
    }

    public Utilisateur() {
    }
}
