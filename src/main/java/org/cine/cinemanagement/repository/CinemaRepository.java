package org.cine.cinemanagement.repository;

import org.cine.cinemanagement.model.Cinema;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CinemaRepository extends JpaRepository<Cinema, Long> {
    public Cinema findByName(String name);
}
