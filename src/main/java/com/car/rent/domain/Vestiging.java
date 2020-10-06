package com.car.rent.domain;

import com.car.rent.valueobject.AdresId;
import com.car.rent.valueobject.VestigingId;

public class Vestiging {
    private String naam;
    private final VestigingId vestigingId;
    private final AdresId adresId;


    public Vestiging(String naam, AdresId adresId) {
        this.vestigingId = new VestigingId();
        this.naam = naam;
        this.adresId = adresId;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public VestigingId getVestigingId() {
        return vestigingId;
    }

    public AdresId getAdresId() {
        return adresId;
    }

}