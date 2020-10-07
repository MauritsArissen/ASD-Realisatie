package com.car.rent.service;

import com.car.rent.domain.Boeking;
import com.car.rent.enumeration.BoekingStatus;
import com.car.rent.repository.BoekingRepository;
import com.car.rent.valueobject.AutoId;
import com.car.rent.valueobject.BoekingId;
import com.car.rent.valueobject.VestigingId;

import java.util.List;

public class BoekingService {

    private final BoekingRepository repository = BoekingRepository.getInstance();
    private final AutoService autoService = new AutoService();

    public List<Boeking> getAll() {
        return repository.getBoekingList();
    }

    public Boeking getById(int id) {
        BoekingId boekingId = new BoekingId(id);
        return repository.getBoekingById(boekingId);
    }

    public Boeking addBoeking(Boeking b) {
        repository.store(b);
        return b;
    }

    public Boeking retourneringAuto(int boekingid) {
        Boeking b = repository.getBoekingById(new BoekingId(boekingid));
        b.retournerningAuto();

        return b;
    }

    public Boeking boekingAnnuleren(int boekingId){
        Boeking boeking = repository.getBoekingById(new BoekingId(boekingId));
        boeking.setBoekingStatus(BoekingStatus.GEANNULEERD);
        return boeking;
    }

}
