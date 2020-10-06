package com.car.rent.valueobject;

import java.util.Date;

public class Periode {
    final Date beginDatum;
    final Date eindDatum;

    public Periode(Date begin, Date eind) {
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