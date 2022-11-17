package org.cine.cinemanagement.service.impl;

import org.cine.cinemanagement.model.City;
import org.cine.cinemanagement.repository.CityRepository;
import org.cine.cinemanagement.service.CityService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
@Transactional
public class CityServiceImpl implements CityService {

    private CityRepository cityRepository;

    public CityServiceImpl(CityRepository cityRepository) {
        this.cityRepository = cityRepository;
    }

    @Override
    public List<City> findAllCities() {
        return cityRepository.findAll();
    }

    @Override
    public City findCityById(Long id) {

        return cityRepository.findById(id).get();
    }

    @Override
    public City findCityByName(String name) {

        return cityRepository.findByCityName(name);
    }

    @Override
    public City saveCity(City city) {

        return cityRepository.save(city);
    }
}
