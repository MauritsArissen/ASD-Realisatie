package com.car.rent.repository;


import com.car.rent.domein.Vestiging;
import com.car.rent.valueobject.VestigingId;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class VestigingRepository {

    private List<Vestiging> vestigingList = Stream.of(
            new Vestiging("Europcar", new VestigingId()),
            new Vestiging("AutoRent", new VestigingId())
    ).collect(Collectors.toList());

    public List<Vestiging> getVestigingList() {
        return vestigingList;
    }

    public void store(Vestiging vestiging) {
        vestigingList.add(vestiging);
    }

    public Vestiging getVestigingById(int id) {
        Vestiging v = null;
        VestigingId compare = new VestigingId(id);
        for (Vestiging vestiging : vestigingList) {
            if (vestiging.getVestigingId().equals(compare)) {
                v = vestiging;
                break;
            }
        }
        return v;
    }
}
