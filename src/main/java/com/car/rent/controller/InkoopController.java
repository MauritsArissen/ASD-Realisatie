package com.car.rent.controller;

import com.car.rent.domain.Inkoop;
import com.car.rent.service.InkoopService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class InkoopController {

    private final InkoopService service = new InkoopService();

    @GetMapping("/inkoop")
    List<Inkoop> all() {
        return service.getAll();
    }

    @GetMapping("/inkoop/{id}")
    Inkoop one(@PathVariable int id) {
        return service.getById(id);
    }

}
