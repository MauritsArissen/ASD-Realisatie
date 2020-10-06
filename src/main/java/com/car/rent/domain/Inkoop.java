package com.car.rent.domain;

import com.car.rent.valueobject.InkoopId;
import com.car.rent.valueobject.InkoopDatum;

public class Inkoop {
    private final InkoopId inkoopId;
    private final InkoopDatum inkoopDatum;



    public Inkoop(InkoopDatum inkoopDatum) {
        this.inkoopId = new InkoopId();
        this.inkoopDatum = inkoopDatum;
    }

    public InkoopId getInkoopId() { return inkoopId; }


    public InkoopDatum getInkoopDatum() { return inkoopDatum; }


}
