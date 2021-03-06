package com.car.rent.repository;

import com.car.rent.domain.Betaling;
import com.car.rent.enumeration.Valuta;
import com.car.rent.valueobject.BetalingId;
import com.car.rent.valueobject.BoekingId;
import com.car.rent.valueobject.Prijs;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BetalingRepository {
    
    private static BetalingRepository instance;

    public static BetalingRepository getInstance() {
        if (instance == null) {
            instance = new BetalingRepository();
        }
        return instance;
    }

    private List<Betaling> betalingList = Stream.of(
            new Betaling(new BoekingId(1)),
            new Betaling(new BoekingId(3)),
            new Betaling(new BoekingId(2))
    ).collect(Collectors.toList());

    public List<Betaling> getBetalingList() { return betalingList; }

    public void store(Betaling betaling) { betalingList.add(betaling); }

    public Betaling getBetalingById(BetalingId compare) {
        Betaling b = null;
        for (Betaling betaling : betalingList) {
            if (betaling.getBetalingId().equals(compare)) {
                b= betaling;
                break;
            }
        }
        return b;
    }
}
