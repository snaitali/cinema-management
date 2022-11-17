package org.cine.cinemanagement.service;

import org.cine.cinemanagement.model.City;

import java.util.List;

public interface CityService {

    List<City> findAllCities();

    City findCityById(Long id);

    City findCityByName(String name);

    City saveCity(City city);
}
