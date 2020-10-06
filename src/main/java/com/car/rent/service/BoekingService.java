package com.car.rent.service;

import com.car.rent.domein.Boeking;
import com.car.rent.repository.BoekingRepository;
import com.car.rent.valueobject.BoekingId;

import java.util.List;

public class BoekingService {

    private final BoekingRepository repository = new BoekingRepository();

    public List<Boeking> getAll() {
        return repository.getBoekingList();
    }

    public Boeking getById(int id) {
        BoekingId boekingId = new BoekingId(id);
        return repository.getBoekingById(boekingId);
    }

    public Boeking retourneringAuto(int boekingId, int vestigingId) {
        Boeking b = repository.getBoekingById(new BoekingId(boekingId));

        return null;
    }

}
