package com.car.rent.service;

import com.car.rent.domain.Inkoop;
import com.car.rent.repository.InkoopRepository;
import com.car.rent.valueobject.InkoopId;

import java.util.List;

public class InkoopService {

    private final InkoopRepository repository = new InkoopRepository();

    public List<Inkoop> getAll() {
        return repository.getInkoopList();
    }

    public Inkoop getById(int id) {
        InkoopId inkoopId = new InkoopId(id);
        return repository.getInkoopById(inkoopId);
    }

}
