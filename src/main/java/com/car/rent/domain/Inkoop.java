package com.car.rent.domain;

import com.car.rent.valueobject.AutoId;
import com.car.rent.valueobject.InkoopId;
import com.car.rent.valueobject.InkoopDatum;

public class Inkoop {
    private final InkoopId inkoopId;
    private final InkoopDatum inkoopDatum;
    private final AutoId autoId;

    public Inkoop(InkoopDatum inkoopDatum, AutoId autoId) {
        this.inkoopId = new InkoopId();
        this.inkoopDatum = inkoopDatum;
        this.autoId = autoId;
    }

    public InkoopId getInkoopId() { return inkoopId; }

    public InkoopDatum getInkoopDatum() { return inkoopDatum; }

    public AutoId getAutoId() {
        return autoId;
    }
}
