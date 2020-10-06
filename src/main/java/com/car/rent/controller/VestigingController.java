package com.car.rent.controller;

import com.car.rent.domain.Vestiging;
import com.car.rent.service.VestigingService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping(value = "/vestiging", consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    Vestiging newVestiging(@RequestBody Vestiging vestiging) {
        return service.addVestiging(vestiging);
    }

    @PutMapping(value = "/vestiging/{id}", consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    Vestiging changeVestigingNaam(@PathVariable int id, @RequestBody String naam) {
        return service.changeVestigingNaam(id, naam);
    }

}
