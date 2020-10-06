package com.car.rent.repository;

import com.car.rent.domain.Vestiging;
import com.car.rent.valueobject.AdresId;
import com.car.rent.valueobject.VestigingId;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class VestigingRepository {

    private List<Vestiging> vestigingList = Stream.of(
            new Vestiging("Europcar", new VestigingId(), new AdresId(1)),
            new Vestiging("AutoRent", new VestigingId(), new AdresId(1))
    ).collect(Collectors.toList());

    public List<Vestiging> getVestigingList() {
        return vestigingList;
    }

    public void store(Vestiging vestiging) {
        vestigingList.add(vestiging);
    }

    public Vestiging getVestigingById(VestigingId compare) {
        Vestiging v = null;
        for (Vestiging vestiging : vestigingList) {
            if (vestiging.getVestigingId().equals(compare)) {
                v = vestiging;
                break;
            }
        }
        return v;
    }
}
