package com.github.lucasrmagalhaes.citiesapi.repository;

import com.github.lucasrmagalhaes.citiesapi.countries.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {}
