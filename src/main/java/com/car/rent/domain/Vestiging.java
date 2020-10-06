package com.car.rent.domain;

import com.car.rent.valueobject.VestigingId;

public class Vestiging {
    private String naam;
    private final VestigingId vestigingId;


    public Vestiging(String naam, VestigingId vestigingId) {
        this.naam = naam;
        this.vestigingId = vestigingId;
    }

    public String getNaam() {
        return naam;
    }

    public String setNaam() { return naam; }

    public VestigingId getVestigingId() {
        return vestigingId;
    }


}