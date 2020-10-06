package com.car.rent.controller;

import com.car.rent.domein.Betaling;
import com.car.rent.service.BetalingService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BetalingController {

    private final BetalingService service = new BetalingService();

    @GetMapping("/betaling")
    List<Betaling> all() {
        return service.getAll();
    }

    @GetMapping("/betaling/{id}")
    Betaling one(@PathVariable int id) {
        return service.getById(id);
    }

}
