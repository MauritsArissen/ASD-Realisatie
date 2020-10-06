package com.car.rent.repository;

import com.car.rent.domein.Boeking;
import com.car.rent.enumeration.Status;
import com.car.rent.valueobject.BoekingId;
import com.car.rent.valueobject.Periode;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BoekingRepository {

    private List<Boeking> boekingList = Stream.of(
            new Boeking(new BoekingId(), new Periode(new Date(), new Date()), Status.AFGEHANDELD),
            new Boeking(new BoekingId(), new Periode(new Date(), new Date()), Status.GEANNULEERD),
            new Boeking(new BoekingId(), new Periode(new Date(), new Date()), Status.INBEHANDELING)
    ).collect(Collectors.toList());

    public List<Boeking> getBoekingList() {
        return boekingList;
    }

    public void store(Boeking boeking) {
        boekingList.add(boeking);
    }

    public Boeking getBoekingById(int id) {
        Boeking b = null;
        BoekingId compare = new BoekingId(id);
        for (Boeking boeking : boekingList) {
            if (boeking.getBoekingId().equals(compare)) {
                b = boeking;
                break;
            }
        }
        return b;
    }
}
