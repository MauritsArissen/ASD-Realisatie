package com.car.rent.repository;

import com.car.rent.domain.Adres;
import com.car.rent.valueobject.AdresId;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AdresRepository {

    private List<Adres> adresList = Stream.of(
            new Adres("Veenendaal", "3901EC", 65),
            new Adres("Utrecht", "3582PW", 9),
            new Adres("Utrecht", "3584CS", 15),
            new Adres("Amsterdam", "1073GB", 247)
    ).collect(Collectors.toList());

    public List<Adres> getAdresList() {
        return adresList;
    }

    public void store(Adres adres) {
        adresList.add(adres);
    }

    public Adres getAdresById(AdresId compare) {
        Adres a = null;
        for (Adres adres : adresList) {
            if (adres.getAdresId().equals(compare)) {
                a = adres;
                break;
            }
        }
        return a;
    }
}
