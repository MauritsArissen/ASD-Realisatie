package com.car.rent.repository;

import com.car.rent.domein.Inkoop;
import com.car.rent.enumeration.Valuta;
import com.car.rent.valueobject.BetalingId;
import com.car.rent.valueobject.InkoopDatum;
import com.car.rent.valueobject.InkoopId;
import com.car.rent.valueobject.Prijs;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class InkoopRepository {
    private List<Inkoop> inkoopList = Stream.of(
            new Inkoop(new InkoopDatum(new Date())),
            new Inkoop(new InkoopDatum(new Date())),
            new Inkoop(new InkoopDatum(new Date()))
    ).collect(Collectors.toList());


    public List<Inkoop> getInkoopList() { return inkoopList; }

    public void store(Inkoop inkoop) { inkoopList.add(inkoop); }

    public Inkoop getInkoopById(InkoopId compare) {
        Inkoop i = null;
        for (Inkoop inkoop : inkoopList) {
            if (inkoop.getInkoopId().equals(compare)) {
                i= inkoop;
                break;
            }
        }
        return i;
    }
}
