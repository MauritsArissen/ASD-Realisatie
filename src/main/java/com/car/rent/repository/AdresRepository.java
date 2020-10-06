package com.car.rent.repository;

import com.car.rent.domein.Adres;
import com.car.rent.valueobject.AdresId;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AdresRepository {

    private List<Adres> adresList = Stream.of(
            new Adres(new AdresId(), "Veenendaal", "3901EC", 65),
            new Adres(new AdresId(), "Utrecht", "3582PW", 9),
            new Adres(new AdresId(), "Utrecht", "3584CS", 15),
            new Adres(new AdresId(), "Amsterdam", "1073GB", 247)
    ).collect(Collectors.toList());

    public List<Adres> getAdresList() {
        return adresList;
    }

    public void store(Adres adres) {
        adresList.add(adres);
    }

    public Adres getAdresById(int id) {
        Adres a = null;
        AdresId compare = new AdresId(id);
        for (Adres adres : adresList) {
            if (adres.getAdresId().equals(compare)) {
                a = adres;
                break;
            }
        }
        return a;
    }
}
