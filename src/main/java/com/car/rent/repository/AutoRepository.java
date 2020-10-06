package com.car.rent.repository;

import com.car.rent.domain.Auto;
import com.car.rent.enumeration.Valuta;
import com.car.rent.valueobject.AutoId;
import com.car.rent.valueobject.AutoType;
import com.car.rent.valueobject.Prijs;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AutoRepository {

    private List<Auto> autoList = Stream.of(
            new Auto(new AutoType("Fiat", "Panda"), new Prijs(13854.00, Valuta.EURO), new Prijs(85.60, Valuta.EURO)),
            new Auto(new AutoType("Mercedes-Benz", "A-Klasse"), new Prijs(29456.00, Valuta.EURO), new Prijs(120.15, Valuta.EURO)),
            new Auto(new AutoType("Porsche", "Cayenne"), new Prijs(100075.00, Valuta.EURO), new Prijs(310.00, Valuta.EURO))
    ).collect(Collectors.toList());

    public List<Auto> getAutoList() {
        return autoList;
    }

    public void store(Auto auto) {
        autoList.add(auto);
    }

    public Auto getAutoById(AutoId compare) {
        Auto a = null;
        for (Auto auto : autoList) {
            if (auto.getAutoId().equals(compare)) {
                a = auto;
                break;
            }
        }
        return a;
    }
}
