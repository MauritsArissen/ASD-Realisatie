package com.car.rent.controller;

import com.car.rent.domein.Klant;
import com.car.rent.service.KlantService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class KlantController {

    private final KlantService service = new KlantService();

    @GetMapping("/klant")
    List<Klant> all() {
        return service.getAll();
    }

    @GetMapping("/klant/{id}")
    Klant one(@PathVariable int id) {
        return service.getById(id);
    }

}
