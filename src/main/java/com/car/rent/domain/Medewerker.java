package com.car.rent.domain;

import com.car.rent.valueobject.AdresId;
import com.car.rent.valueobject.MedewerkerId;
import com.car.rent.valueobject.MedewerkerNaam;
import com.car.rent.valueobject.VestigingId;

public class Medewerker {
    private final MedewerkerId medewerkerId;
    private final MedewerkerNaam medewerkerNaam;
    private AdresId adresId;
    private final VestigingId vestigingId;


    public Medewerker(MedewerkerNaam medewerkerNaam, AdresId adresId, VestigingId vestigingId) {
        this.medewerkerId = new MedewerkerId();
        this.medewerkerNaam = medewerkerNaam;
        this.adresId = adresId;
        this.vestigingId = vestigingId;
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

    public VestigingId getVestigingId() {
        return vestigingId;
    }
}
