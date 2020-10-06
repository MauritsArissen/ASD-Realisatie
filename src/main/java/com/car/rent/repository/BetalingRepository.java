package com.car.rent.repository;

import com.car.rent.domein.Betaling;
import com.car.rent.enumeration.Valuta;
import com.car.rent.valueobject.BetalingId;
import com.car.rent.valueobject.BoekingPeriode;
import com.car.rent.valueobject.Prijs;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BetalingRepository {

    private List<Betaling> betalingList = Stream.of(
            new Betaling(new Prijs(28.50, Valuta.EURO)),
            new Betaling(new Prijs(150.90, Valuta.DOLLAR)),
            new Betaling(new Prijs(300, Valuta.POUNDS))

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
