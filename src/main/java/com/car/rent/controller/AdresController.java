package com.car.rent.controller;

import com.car.rent.domein.Adres;
import com.car.rent.service.AdresService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AdresController {

    private final AdresService service = new AdresService();

    @GetMapping("/adres")
    List<Adres> all() {
        return service.getAll();
    }

    @GetMapping("/adres/{id}")
    Adres one(@PathVariable int id) {
        return service.getById(id);
    }

}
