package com.car.rent.service;

import com.car.rent.domein.Inkoop;
import com.car.rent.repository.InkoopRepository;

import java.util.List;

public class InkoopService {

    private final InkoopRepository repository = new InkoopRepository();

    public List<Inkoop> getAll() {
        return repository.getInkoopList();
    }

    public Inkoop getById(int id) {
        return repository.getInkoopById(id);
    }

}
