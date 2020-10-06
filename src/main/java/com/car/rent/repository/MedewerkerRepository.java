package com.car.rent.repository;

import com.car.rent.domein.Adres;
import com.car.rent.domein.Medewerker;
import com.car.rent.valueobject.AdresId;
import com.car.rent.valueobject.KlantNaam;
import com.car.rent.valueobject.MedewerkerId;
import com.car.rent.valueobject.MedewerkerNaam;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MedewerkerRepository {

    private List<Medewerker> medewerkerList= Stream.of(
            new Medewerker(new MedewerkerNaam("Lucas", "Smits"), new AdresId(1)),
            new Medewerker(new MedewerkerNaam("Sam", "Jacobs"), new AdresId(1)),
            new Medewerker(new MedewerkerNaam("Bram", "Schouten"), new AdresId(1) ),
            new Medewerker(new MedewerkerNaam("Thomas", "Jonker"), new AdresId(1))
    ).collect(Collectors.toList());

    public List<Medewerker> getMedewerkerList() {
        return medewerkerList;
    }

    public void store(Medewerker medewerker) {
        medewerkerList.add(medewerker);
    }

    public Medewerker getMedewerkerById(MedewerkerId compare) {
        Medewerker m = null;
        for (Medewerker medewerker : medewerkerList) {
            if (medewerker.getMedewerkerId().equals(compare)) {
                m = medewerker;
                break;
            }
        }
        return m;
    }
}
