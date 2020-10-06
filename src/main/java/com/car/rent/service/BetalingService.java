package com.car.rent.service;

import com.car.rent.domein.Betaling;
import com.car.rent.repository.BetalingRepository;
import com.car.rent.valueobject.BetalingId;
import com.car.rent.valueobject.BoekingId;

import java.util.List;

public class BetalingService {

    private final BetalingRepository repository = new BetalingRepository();

    public List<Betaling> getAll() {
        return repository.getBetalingList();
    }

    public Betaling getById(int id) {
        BetalingId betalingId = new BetalingId(id);
        return repository.getBetalingById(betalingId);
    }

    public Betaling betalingBoeking(int bId) {
        BoekingId boekingId = new BoekingId(bId);
        Betaling betaling = null;
        return betaling;
    }

}
