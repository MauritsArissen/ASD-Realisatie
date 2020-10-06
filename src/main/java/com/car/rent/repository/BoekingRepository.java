package com.car.rent.repository;

import com.car.rent.domein.Boeking;
import com.car.rent.domein.Klant;
import com.car.rent.enumeration.BoekingStatus;
import com.car.rent.valueobject.*;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BoekingRepository {

    private List<Boeking> boekingList = Stream.of(
            new Boeking(new BoekingId(), new BoekingPeriode(new Date(), new Date()), BoekingStatus.AFGEHANDELD, new KlantId(1), new AutoId(1), new VestigingId(1), new VestigingId(2), new BetalingId(1)),
            new Boeking(new BoekingId(), new BoekingPeriode(new Date(), new Date()), BoekingStatus.GEANNULEERD, new KlantId(1), new AutoId(1), new VestigingId(1), new VestigingId(2), new BetalingId(1)),
            new Boeking(new BoekingId(), new BoekingPeriode(new Date(), new Date()), BoekingStatus.INBEHANDELING, new KlantId(1), new AutoId(1), new VestigingId(1), new VestigingId(2), new BetalingId(1)),
            new Boeking(new BoekingId(), new BoekingPeriode(new Date(), new Date()), BoekingStatus.GEHONOREERD, new KlantId(1), new AutoId(1), new VestigingId(1), new VestigingId(2), new BetalingId(1))
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

    public List<Boeking> getBoekingByKlantId(int id) {
        List<Boeking> boekingen = null;
        KlantId compare = new KlantId(id);
        for (Boeking boeking : boekingList) {
            if (boeking.getBoekingId().equals(compare)) {
                boekingen.add(boeking);
            }
        }
        return boekingen;
    }
}
