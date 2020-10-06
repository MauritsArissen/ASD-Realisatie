package com.car.rent.repository;

import com.car.rent.domain.Boeking;
import com.car.rent.enumeration.BoekingStatus;
import com.car.rent.valueobject.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BoekingRepository {

    private List<Boeking> boekingList = Stream.of(
            new Boeking(new BoekingPeriode(new Date(), new Date()), BoekingStatus.INBEHANDELING, new KlantId(1), new AutoId(1), new VestigingId(1), new VestigingId(2), new BetalingId(1)),
            new Boeking(new BoekingPeriode(new Date(), new Date()), BoekingStatus.GEANNULEERD, new KlantId(1), new AutoId(1), new VestigingId(1), new VestigingId(2), new BetalingId(1)),
            new Boeking(new BoekingPeriode(new Date(), new Date()), BoekingStatus.INBEHANDELING, new KlantId(1), new AutoId(1), new VestigingId(1), new VestigingId(2), new BetalingId(1)),
            new Boeking(new BoekingPeriode(new Date(), new Date()), BoekingStatus.GEHONOREERD, new KlantId(1), new AutoId(1), new VestigingId(1), new VestigingId(2), new BetalingId(1))
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

    public List<Boeking> getBoekingByKlantId(KlantId compare) {
        List<Boeking> boekingen = new ArrayList<>();
        for (Boeking boeking : boekingList) {
            if (boeking.getKlantId().equals(compare)) {
                boekingen.add(boeking);
                System.out.println(boeking.getBoekingId().getId());
            }
        }
        return boekingen;
    }

}
