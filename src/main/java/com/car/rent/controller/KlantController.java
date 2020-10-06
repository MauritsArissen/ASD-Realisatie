package com.car.rent.controller;

import com.car.rent.domein.Klant;
import com.car.rent.service.KlantService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping(value = "/klant", consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    Klant newKlant(@RequestBody Klant klant) {
        return service.addKlant(klant);
    }

}
