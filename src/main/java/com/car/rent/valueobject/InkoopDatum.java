package com.car.rent.valueobject;

import java.util.Date;

public class InkoopDatum {
    final Date inkoopDatum;


    public InkoopDatum(Date inkoopDatum) {
        this.inkoopDatum = inkoopDatum;
    }

    public Date getInkoopDatum() { return inkoopDatum; }

}