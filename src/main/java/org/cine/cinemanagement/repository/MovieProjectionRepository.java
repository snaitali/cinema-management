package org.cine.cinemanagement.repository;

import org.cine.cinemanagement.model.MovieProjection;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieProjectionRepository extends JpaRepository<MovieProjection, Long> {
}
