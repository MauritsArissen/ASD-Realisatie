package com.car.rent.service;

import com.car.rent.domain.Auto;
import com.car.rent.domain.Inkoop;
import com.car.rent.repository.AutoRepository;
import com.car.rent.repository.InkoopRepository;
import com.car.rent.valueobject.AutoId;
import com.car.rent.valueobject.InkoopDatum;
import com.car.rent.valueobject.InkoopId;

import java.time.LocalDate;
import java.util.List;

public class InkoopService {

    private final InkoopRepository repository = InkoopRepository.getInstance();

    public List<Inkoop> getAll() {
        return repository.getInkoopList();
    }

    public Inkoop getById(int id) {
        InkoopId inkoopId = new InkoopId(id);
        return repository.getInkoopById(inkoopId);
    }

    public Inkoop inkoopAuto(Auto auto) {
        AutoRepository ar = AutoRepository.getInstance();
        ar.store(auto);
        Inkoop inkoop = new Inkoop(new InkoopDatum(LocalDate.now()), auto.getAutoId());
        repository.store(inkoop);
        return inkoop;
    }

}
