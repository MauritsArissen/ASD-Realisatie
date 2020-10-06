package com.car.rent.valueobject;

import java.time.LocalDate;

public class InkoopDatum {
    final LocalDate inkoopDatum;

    public InkoopDatum(LocalDate inkoopDatum) {
        this.inkoopDatum = inkoopDatum;
    }

    public LocalDate getInkoopDatum() { return inkoopDatum; }

}