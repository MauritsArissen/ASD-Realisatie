package com.car.rent.controller;

import com.car.rent.domain.Betaling;
import com.car.rent.service.BetalingService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping(value = "/betaling", consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    Betaling newBetaling

}
