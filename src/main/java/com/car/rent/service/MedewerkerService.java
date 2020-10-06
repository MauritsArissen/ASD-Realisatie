package com.car.rent.service;

import com.car.rent.domain.Medewerker;
import com.car.rent.repository.MedewerkerRepository;
import com.car.rent.valueobject.MedewerkerId;

import java.util.List;

public class MedewerkerService {

    private final MedewerkerRepository repository = MedewerkerRepository.getInstance();

    public List<Medewerker> getAll() {
        return repository.getMedewerkerList();
    }

    public Medewerker getById(int id) {
        MedewerkerId medewerkerId = new MedewerkerId(id);
        return repository.getMedewerkerById(medewerkerId);
    }

}
