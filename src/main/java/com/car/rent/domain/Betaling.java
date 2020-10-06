package com.car.rent.domain;

import com.car.rent.valueobject.BetalingId;
import com.car.rent.valueobject.BoekingId;
import com.car.rent.valueobject.BoekingPeriode;
import com.car.rent.valueobject.Prijs;

import java.time.LocalDate;

public class Betaling {
    private final BetalingId betalingId;
    private final LocalDate datum;
    private final BoekingId boekingId;
    private Prijs prijs;

    public Betaling(BoekingId boekingId) {
        this.betalingId = new BetalingId();
        this.boekingId = boekingId;
        this.datum = LocalDate.now();
    }

    public BetalingId getBetalingId() { return betalingId; }

    public LocalDate getDatum() { return datum; }

    public Prijs getPrijs() { return prijs; }

    public void setPrijs(Prijs prijs) {
        this.prijs = prijs;
    }

    public void pay(Prijs dagWaarde, BoekingPeriode periode) {
        
    }
}
