package com.car.rent.controller;

import com.car.rent.domain.Auto;
import com.car.rent.domain.Inkoop;
import com.car.rent.service.InkoopService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class InkoopController {

    private final InkoopService service = new InkoopService();

    @GetMapping("/inkoop")
    List<Inkoop> all() {
        return service.getAll();
    }

    @GetMapping("/inkoop/{id}")
    Inkoop one(@PathVariable int id) {
        return service.getById(id);
    }

    @PostMapping(value = "/inkoop", consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    Inkoop inkoopAuto(@RequestBody Auto auto) {
        return service.inkoopAuto(auto);
    }

}
