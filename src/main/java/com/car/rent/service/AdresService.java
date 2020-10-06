package com.car.rent.service;

import com.car.rent.domein.Adres;
import com.car.rent.repository.AdresRepository;

import java.util.List;

public class AdresService {

    private final AdresRepository repository = new AdresRepository();

    public List<Adres> getAll() {
        return repository.getAdresList();
    }

    public Adres getById(int id) {
        return repository.getAdresById(id);
    }

    public Adres addAdres(Adres adres) {
        repository.store(adres);
        return adres;
    }

}
