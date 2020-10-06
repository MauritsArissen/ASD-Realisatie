package com.car.rent.valueobject;

import java.util.Date;

public class BoekingPeriode {
    final Date beginDatum;
    final Date eindDatum;

    public BoekingPeriode(Date begin, Date eind) {
        this.beginDatum = begin;
        this.eindDatum = eind;
    }

    public Date getBeginDatum() {
        return beginDatum;
    }

    public Date getEindDatum() {
        return eindDatum;
    }
}