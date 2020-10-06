package com.car.rent.domain;

import com.car.rent.repository.AutoRepository;
import com.car.rent.repository.BoekingRepository;
import com.car.rent.valueobject.BetalingId;
import com.car.rent.valueobject.BoekingId;
import com.car.rent.valueobject.BoekingPeriode;
import com.car.rent.valueobject.Prijs;

import java.time.Duration;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Betaling {
    private final BetalingId betalingId;
    private final LocalDate datum;
    private final BoekingId boekingId;
    private Prijs prijs;

    public Betaling(BoekingId boekingId) {
        this.betalingId = new BetalingId();
        this.boekingId = boekingId;
        this.datum = LocalDate.now();
        this.betaal();
    }

    public BetalingId getBetalingId() { return betalingId; }

    public LocalDate getDatum() { return datum; }

    public Prijs getPrijs() { return prijs; }

    public void betaal() {
        BoekingRepository br = BoekingRepository.getInstance();
        AutoRepository ar = AutoRepository.getInstance();

        Boeking b = br.getBoekingById(this.boekingId);
        BoekingPeriode periode = b.getBoekingPeriode();
        Auto a = ar.getAutoById(b.getAutoId());
        Prijs dagWaarde = a.getDagPrijs();

        long dagen = ChronoUnit.DAYS.between(periode.getBeginDatum().toInstant(), periode.getEindDatum().toInstant());
        double total = dagen * dagWaarde.getPrijs();
        this.prijs = new Prijs(total, dagWaarde.getValuta());
    }
}
