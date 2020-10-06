package com.car.rent.repository;

import com.car.rent.domain.Adres;
import com.car.rent.domain.Boeking;
import com.car.rent.domain.Medewerker;
import com.car.rent.domain.Vestiging;
import com.car.rent.valueobject.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MedewerkerRepository {

    private List<Medewerker> medewerkerList= Stream.of(
            new Medewerker(new MedewerkerNaam("Lucas", "Smits"), new AdresId(1), new VestigingId(1)),
            new Medewerker(new MedewerkerNaam("Sam", "Jacobs"), new AdresId(1), new VestigingId(1)),
            new Medewerker(new MedewerkerNaam("Bram", "Schouten"), new AdresId(1), new VestigingId(1)),
            new Medewerker(new MedewerkerNaam("Thomas", "Jonker"), new AdresId(1), new VestigingId(1))
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

    public List<Medewerker> getVestigingByMedewerkerId(VestigingId compare) {
        List<Medewerker> medewerkers = new ArrayList<>();
        for (Medewerker medewerker : medewerkerList) {
            if (medewerker.getVestigingId().equals(compare)) {
                medewerkers.add(medewerker);
                System.out.println(medewerker.getVestigingId().getId());
            }
        }
        return medewerkers;
    }
}
