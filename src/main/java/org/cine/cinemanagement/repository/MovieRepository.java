package org.cine.cinemanagement.repository;

import org.cine.cinemanagement.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie, Long> {
    public Movie findByName(String name);
}
