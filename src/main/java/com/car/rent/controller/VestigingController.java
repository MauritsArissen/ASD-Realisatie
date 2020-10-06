package com.car.rent.controller;

import com.car.rent.domain.Vestiging;
import com.car.rent.service.VestigingService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class VestigingController {

    private final VestigingService service = new VestigingService();

    @GetMapping("/vestiging")
    List<Vestiging> all() {
        return service.getAll();
    }

    @GetMapping("/vestiging/{id}")
    Vestiging one(@PathVariable int id) {
        return service.getById(id);
    }

}
