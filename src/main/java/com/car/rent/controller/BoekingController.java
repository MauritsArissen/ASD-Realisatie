package com.car.rent.controller;

import com.car.rent.domain.Boeking;
import com.car.rent.service.BoekingService;
import com.car.rent.valueobject.BoekingId;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

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

    @PutMapping("/boeking/{boekingid}/retournering")
    @ResponseBody
    Boeking retournerningAuto(@PathVariable int boekingid) {
        return service.retourneringAuto(boekingid);
    }

    @PostMapping(value = "/boeking", consumes = MediaType.APPLICATION_JSON_VALUE)
    Boeking boekAuto(@RequestBody Boeking boeking) {
        return service.addBoeking(boeking);
    }

    @PutMapping("/boeking/{boekingId}/annuleren")
    @ResponseBody
    Boeking boekingAnnuleren (@PathVariable int boekingId){return service.boekingAnnuleren(boekingId);}

}
