package com.car.rent.domein;

import com.car.rent.valueobject.AdresId;
import com.car.rent.valueobject.MedewerkerId;
import com.car.rent.valueobject.MedewerkerNaam;
import com.car.rent.valueobject.InkoopId;
import com.car.rent.valueobject.InkoopDatum;

public class Inkoop {
    private final InkoopId inkoopId;
    private final InkoopDatum inkoopDatum;



    public Inkoop(InkoopId inkoopId, InkoopDatum inkoopDatum) {
        this.inkoopId = inkoopId;
        this.inkoopDatum = inkoopDatum;
    }

    public InkoopId getInkoopId() { return inkoopId; }


    public InkoopDatum getInkoopDatum() { return inkoopDatum; }


}
