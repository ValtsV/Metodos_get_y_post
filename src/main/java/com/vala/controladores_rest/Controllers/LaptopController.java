package com.vala.controladores_rest.Controllers;

import com.vala.controladores_rest.Entities.Laptop;
import com.vala.controladores_rest.Repositories.LaptopRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class LaptopController {

    private final LaptopRepository repository;

    public LaptopController(LaptopRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/laptops")
    public List<Laptop> findAll() {
        return repository.findAll();
    }

    @PostMapping("/laptops")
    public Laptop saveLaptop(@RequestBody Laptop laptop) {

        return repository.save(laptop);
    }
}
