package com.car.rent.repository;

import com.car.rent.domain.Klant;
import com.car.rent.valueobject.AdresId;
import com.car.rent.valueobject.KlantId;
import com.car.rent.valueobject.KlantNaam;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class KlantRepository {

    private List<Klant> klantList = Stream.of(
            new Klant(new KlantNaam("Maurits", "Arissen"), new AdresId(1)),
            new Klant(new KlantNaam("Rick", "Gadella"), new AdresId(1)),
            new Klant(new KlantNaam("Anka", "Andonova"), new AdresId(1)),
            new Klant(new KlantNaam("Frank", "Cornelissen"), new AdresId(3)),
            new Klant(new KlantNaam("Redouan", "El Hidraoui"), new AdresId(3))
    ).collect(Collectors.toList());

    public List<Klant> getKlantList() {
        return klantList;
    }

    public void store(Klant klant) {
        klantList.add(klant);
    }

    public Klant getKlantById(KlantId compare) {
        Klant a = null;
        for (Klant klant : klantList) {
            if (klant.getKlantId().equals(compare)) {
                a = klant;
                break;
            }
        }
        return a;
    }
}
