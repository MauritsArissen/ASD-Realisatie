package com.car.rent.domein;

import com.car.rent.valueobject.BetalingId;
import com.car.rent.valueobject.Prijs;

import java.time.LocalDate;

public class Betaling {
    private final BetalingId betalingId;
    private final LocalDate datum;
    private final Prijs prijs;

    public Betaling(Prijs prijs) {
        this.betalingId = new BetalingId();
        this.datum = LocalDate.now();
        this.prijs = prijs;
    }

    public BetalingId getBetalingId() { return betalingId; }

    public LocalDate getDatum() { return datum; }

    public Prijs getPrijs() { return prijs; }
}
