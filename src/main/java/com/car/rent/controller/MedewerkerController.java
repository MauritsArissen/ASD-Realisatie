package com.car.rent.controller;

import com.car.rent.domain.Medewerker;
import com.car.rent.service.MedewerkerService;
import com.car.rent.valueobject.AdresId;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping(value = "/medewerker", consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    Medewerker newMedewerker(@RequestBody Medewerker medewerker) { return service.addMedewerker(medewerker); }

    @PutMapping(value = "/medewerker/{id}", consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    Medewerker changeMedewerkerAdres(@PathVariable int id, @RequestBody AdresId adresId) {
        return service.changeMedewerkerAdres(id, adresId);
    }
}
