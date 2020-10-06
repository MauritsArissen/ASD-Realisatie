package com.car.rent.service;

import com.car.rent.domein.Vestiging;
import com.car.rent.repository.VestigingRepository;

import java.util.List;

public class VestigingService {

    private final VestigingRepository repository = new VestigingRepository();

    public List<Vestiging> getAll() {
        return repository.getVestigingList();
    }

    public Vestiging getById(int id) {
        return repository.getVestigingById(id);
    }

}
