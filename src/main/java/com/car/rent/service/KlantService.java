package com.car.rent.service;

import com.car.rent.domein.Klant;
import com.car.rent.repository.KlantRepository;
import com.car.rent.valueobject.KlantId;

import java.util.List;

public class KlantService {

    private final KlantRepository repository = new KlantRepository();

    public List<Klant> getAll() {
        return repository.getKlantList();
    }

    public Klant getById(int id) {
        KlantId klantId = new KlantId(id);
        return repository.getKlantById(klantId);
    }

    public Klant addKlant(Klant klant) {
        repository.store(klant);
        return klant;
    }

}
