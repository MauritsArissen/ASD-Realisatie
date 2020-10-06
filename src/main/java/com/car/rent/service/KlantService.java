package com.car.rent.service;

import com.car.rent.domein.Klant;
import com.car.rent.repository.KlantRepository;

import java.util.List;

public class KlantService {

    private final KlantRepository repository = new KlantRepository();

    public List<Klant> getAll() {
        return repository.getKlantList();
    }

    public Klant getById(int id) {
        return repository.getKlantById(id);
    }

}
