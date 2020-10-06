package com.car.rent.service;

import com.car.rent.domain.Adres;
import com.car.rent.repository.AdresRepository;
import com.car.rent.valueobject.AdresId;

import java.util.List;

public class AdresService {

    private final AdresRepository repository = new AdresRepository();

    public List<Adres> getAll() {
        return repository.getAdresList();
    }

    public Adres getById(int id) {
        AdresId adresId = new AdresId(id);
        return repository.getAdresById(adresId);
    }

    public Adres addAdres(Adres adres) {
        repository.store(adres);
        return adres;
    }

}
