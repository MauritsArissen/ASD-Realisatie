package com.car.rent.domein;

import com.car.rent.enumeration.BoekingStatus;
import com.car.rent.valueobject.BoekingId;
import com.car.rent.valueobject.BoekingPeriode;

public class Boeking {
    private final BoekingId boekingId;
    private final BoekingPeriode boekingPeriode;
    private BoekingStatus boekingStatus;

    public Boeking(BoekingPeriode boekingPeriode, BoekingStatus boekingStatus) {
        this.boekingId = new BoekingId();
        this.boekingPeriode = boekingPeriode;
        this.boekingStatus = boekingStatus;
    }

    public BoekingId getBoekingId() {
        return boekingId;
    }

    public BoekingPeriode getBoekingPeriode() {
        return boekingPeriode;
    }

    public BoekingStatus getBoekingStatus() {
        return boekingStatus;
    }

    public void setBoekingStatus(BoekingStatus boekingStatus) {
        this.boekingStatus = boekingStatus;
    }
}