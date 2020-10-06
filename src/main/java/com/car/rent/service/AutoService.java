package com.car.rent.service;

import com.car.rent.domain.Auto;
import com.car.rent.repository.AutoRepository;
import com.car.rent.valueobject.AutoId;

import java.util.List;

public class AutoService {

    private final AutoRepository repository = new AutoRepository();

    public List<Auto> getAll() {
        return repository.getAutoList();
    }

    public Auto getById(int id) {
        AutoId autoId = new AutoId(id);
        return repository.getAutoById(autoId);
    }

}
