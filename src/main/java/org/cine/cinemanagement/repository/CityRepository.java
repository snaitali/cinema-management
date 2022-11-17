package org.cine.cinemanagement.repository;

import org.cine.cinemanagement.model.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CityRepository extends JpaRepository<City, Long> {
    public City findByCityName(String name);
}
