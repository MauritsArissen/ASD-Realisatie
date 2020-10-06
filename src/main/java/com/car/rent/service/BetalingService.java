package com.car.rent.service;

import com.car.rent.domein.Betaling;
import com.car.rent.repository.BetalingRepository;

import java.util.List;

public class BetalingService {

    private final BetalingRepository repository = new BetalingRepository();

    public List<Betaling> getAll() {
        return repository.getBetalingList();
    }

    public Betaling getById(int id) {
        return repository.getBetalingById(id);
    }

}
