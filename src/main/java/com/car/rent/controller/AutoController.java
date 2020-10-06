package com.car.rent.controller;

import com.car.rent.domain.Auto;
import com.car.rent.service.AutoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AutoController {

    private final AutoService service = new AutoService();

    @GetMapping("/auto")
    List<Auto> all() {
        return service.getAll();
    }

    @GetMapping("/auto/{id}")
    Auto one(@PathVariable int id) {
        return service.getById(id);
    }

}
