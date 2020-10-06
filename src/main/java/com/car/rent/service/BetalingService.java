package com.car.rent.service;

import com.car.rent.domain.Auto;
import com.car.rent.domain.Betaling;
import com.car.rent.domain.Boeking;
import com.car.rent.repository.AutoRepository;
import com.car.rent.repository.BetalingRepository;
import com.car.rent.repository.BoekingRepository;
import com.car.rent.valueobject.BetalingId;
import com.car.rent.valueobject.BoekingId;
import com.car.rent.valueobject.BoekingPeriode;
import com.car.rent.valueobject.Prijs;

import java.util.List;

public class BetalingService {

    private final BetalingRepository repository = BetalingRepository.getInstance();

    public List<Betaling> getAll() {
        return repository.getBetalingList();
    }

    public Betaling getById(int id) {
        BetalingId betalingId = new BetalingId(id);
        return repository.getBetalingById(betalingId);
    }

    public Betaling addBetaling(BoekingId boekingId) {
        Betaling betaling = new Betaling(boekingId);

        BoekingRepository br = BoekingRepository.getInstance();
        AutoRepository ar = AutoRepository.getInstance();

        Boeking b = br.getBoekingById(boekingId);
        BoekingPeriode boekingPeriode = b.getBoekingPeriode();
        Auto a = ar.getAutoById(b.getAutoId());
        Prijs dagWaarde = a.getDagPrijs();

        betaling.betaal(dagWaarde, boekingPeriode);

        repository.store(betaling);
        return betaling;
    }

}
