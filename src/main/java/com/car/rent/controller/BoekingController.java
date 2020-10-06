package com.car.rent.controller;

import com.car.rent.domein.Boeking;
import com.car.rent.service.BoekingService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BoekingController {

    private final BoekingService service = new BoekingService();

    @GetMapping("/boeking")
    List<Boeking> all() {
        return service.getAll();
    }

    @GetMapping("/boeking/{id}")
    Boeking one(@PathVariable int id) {
        return service.getById(id);
    }

}
