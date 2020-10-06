package com.car.rent.controller;

import com.car.rent.domein.Boeking;
import com.car.rent.service.BoekingService;
import org.json.JSONObject;
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

    @PutMapping("/boeking/{boekingid}/retournerning")
    Boeking retournerningAuto(@PathVariable int boekingid, @RequestBody String data) {
        JSONObject jsonObject = new JSONObject(data);
        return service.retourneringAuto(boekingid, jsonObject.getInt("vestigingid"));
    }

}
