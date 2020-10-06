package com.car.rent.service;

import com.car.rent.domein.Medewerker;
import com.car.rent.repository.MedewerkerRepository;
import com.car.rent.valueobject.MedewerkerId;

import java.util.List;

public class MedewerkerService {

    private final MedewerkerRepository repository = new MedewerkerRepository();

    public List<Medewerker> getAll() {
        return repository.getMedewerkerList();
    }

    public Medewerker getById(int id) {
        MedewerkerId medewerkerId = new MedewerkerId(id);
        return repository.getMedewerkerById(medewerkerId);
    }

}
