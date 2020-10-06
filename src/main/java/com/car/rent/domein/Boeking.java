package com.car.rent.domein;

import com.car.rent.enumeration.Status;
import com.car.rent.valueobject.BoekingId;
import com.car.rent.valueobject.Periode;

import java.util.Date;

public class Boeking {
    private BoekingId boekingId;
    private Periode periode;
    private Status status;

    public Boeking(BoekingId boekingId, Periode periode, Status status) {
        this.boekingId = boekingId;
        this.periode = periode;
        this.status = status;
    }

    public BoekingId getBoekingId() {
        return boekingId;
    }

    public Periode getPeriode() {
        return periode;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}