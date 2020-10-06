package com.car.rent.domain;

import com.car.rent.valueobject.AdresId;
import com.car.rent.valueobject.MedewerkerId;
import com.car.rent.valueobject.MedewerkerNaam;

public class Medewerker {
    private final MedewerkerId medewerkerId;
    private final MedewerkerNaam medewerkerNaam;
    private AdresId adresId;


    public Medewerker(MedewerkerNaam medewerkerNaam, AdresId adresId) {
        this.medewerkerId = new MedewerkerId();
        this.medewerkerNaam = medewerkerNaam;
        this.adresId = adresId;
    }

    public MedewerkerId getMedewerkerId() { return medewerkerId; }

    public MedewerkerNaam getMedewerkerNaam() {
        return medewerkerNaam;
    }

    public AdresId getAdresId() {
        return adresId;
    }

    public void setAdresId(AdresId adresId) {
        this.adresId = adresId;
    }


}
