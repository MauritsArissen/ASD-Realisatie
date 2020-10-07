package com.car.rent.repository;

import com.car.rent.domain.Inkoop;
import com.car.rent.valueobject.AutoId;
import com.car.rent.valueobject.InkoopDatum;
import com.car.rent.valueobject.InkoopId;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class InkoopRepository {

    private static InkoopRepository instance;

    public static InkoopRepository getInstance() {
        if (instance == null) {
            instance = new InkoopRepository();
        }
        return instance;
    }
    
    private List<Inkoop> inkoopList = Stream.of(
            new Inkoop(new InkoopDatum(LocalDate.now()), new AutoId(1)),
            new Inkoop(new InkoopDatum(LocalDate.now()), new AutoId(2)),
            new Inkoop(new InkoopDatum(LocalDate.now()), new AutoId(3))
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
