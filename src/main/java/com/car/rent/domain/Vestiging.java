package com.car.rent.domain;

import com.car.rent.valueobject.AdresId;
import com.car.rent.valueobject.VestigingId;

public class Vestiging {
    private String naam;
    private final VestigingId vestigingId;
    private final AdresId adresId;


    public Vestiging(String naam, VestigingId vestigingId, AdresId adresId) {
        this.naam = naam;
        this.vestigingId = vestigingId;
        this.adresId = adresId;
    }

    public String getNaam() {
        return naam;
    }

    public String setNaam() { return naam; }

    public VestigingId getVestigingId() {
        return vestigingId;
    }

    public AdresId getAdresId() {
        return adresId;
    }

}