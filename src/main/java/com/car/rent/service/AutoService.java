package com.car.rent.service;

import com.car.rent.domein.Auto;
import com.car.rent.repository.AutoRepository;

import java.util.List;

public class AutoService {

    private final AutoRepository repository = new AutoRepository();

    public List<Auto> getAll() {
        return repository.getAutoList();
    }

    public Auto getById(int id) {
        return repository.getAutoById(id);
    }

}
