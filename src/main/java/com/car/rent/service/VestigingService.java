package com.car.rent.service;

import com.car.rent.domain.Vestiging;
import com.car.rent.repository.VestigingRepository;
import com.car.rent.valueobject.VestigingId;

import java.util.List;

public class VestigingService {

    private final VestigingRepository repository = VestigingRepository.getInstance();

    public List<Vestiging> getAll() {
        return repository.getVestigingList();
    }

    public Vestiging getById(int id) {
        VestigingId vestigingId = new VestigingId(id);
        return repository.getVestigingById(vestigingId);
    }

    public Vestiging addVestiging(Vestiging vestiging) {
        repository.store(vestiging);
        return vestiging;
    }

    public Vestiging changeVestigingNaam(int id, String naam) {
        Vestiging vestiging = repository.getVestigingById(new VestigingId(id));
        vestiging.setNaam(naam);
        return vestiging;
    }

}
