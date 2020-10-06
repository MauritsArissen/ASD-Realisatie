package com.car.rent.controller;

import com.car.rent.domain.Medewerker;
import com.car.rent.service.MedewerkerService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MedewerkerController {

    private final MedewerkerService service = new MedewerkerService();

    @GetMapping("/medewerker")
    List<Medewerker> all() {
        return service.getAll();
    }

    @GetMapping("/medewerker/{id}")
    Medewerker one(@PathVariable int id) {
        return service.getById(id);
    }

}
