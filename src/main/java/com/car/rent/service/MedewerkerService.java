package com.car.rent.service;

import com.car.rent.domein.Medewerker;
import com.car.rent.repository.MedewerkerRepository;

import java.util.List;

public class MedewerkerService {

    private final MedewerkerRepository repository = new MedewerkerRepository();

    public List<Medewerker> getAll() {
        return repository.getMedewerkerList();
    }

    public Medewerker getById(int id) {
        return repository.getMedewerkerById(id);
    }

}
