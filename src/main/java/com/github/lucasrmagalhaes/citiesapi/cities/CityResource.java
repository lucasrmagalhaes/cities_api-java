package com.github.lucasrmagalhaes.citiesapi.cities;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("cities")
public class CityResource {
    private final CityRepository repository;

    public CityResource(final CityRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public Page<City> cities(final Pageable page) {
        return repository.findAll(page);
    }
}