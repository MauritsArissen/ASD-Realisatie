package com.car.rent.service;

import com.car.rent.domein.Vestiging;
import com.car.rent.repository.VestigingRepository;
import com.car.rent.valueobject.VestigingId;

import java.util.List;

public class VestigingService {

    private final VestigingRepository repository = new VestigingRepository();

    public List<Vestiging> getAll() {
        return repository.getVestigingList();
    }

    public Vestiging getById(int id) {
        VestigingId vestigingId = new VestigingId(id);
        return repository.getVestigingById(vestigingId);
    }

}
