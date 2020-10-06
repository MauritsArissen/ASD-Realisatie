package com.car.rent.repository;

import com.car.rent.domein.Boeking;
import com.car.rent.enumeration.BoekingStatus;
import com.car.rent.valueobject.BoekingId;
import com.car.rent.valueobject.BoekingPeriode;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BoekingRepository {

    private List<Boeking> boekingList = Stream.of(
            new Boeking(new BoekingPeriode(new Date(), new Date()), BoekingStatus.AFGEHANDELD),
            new Boeking(new BoekingPeriode(new Date(), new Date()), BoekingStatus.GEANNULEERD),
            new Boeking(new BoekingPeriode(new Date(), new Date()), BoekingStatus.INBEHANDELING)
    ).collect(Collectors.toList());

    public List<Boeking> getBoekingList() {
        return boekingList;
    }

    public void store(Boeking boeking) {
        boekingList.add(boeking);
    }

    public Boeking getBoekingById(BoekingId compare) {
        Boeking b = null;
        for (Boeking boeking : boekingList) {
            if (boeking.getBoekingId().equals(compare)) {
                b = boeking;
                break;
            }
        }
        return b;
    }
}
