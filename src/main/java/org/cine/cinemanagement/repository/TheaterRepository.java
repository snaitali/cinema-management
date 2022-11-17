package org.cine.cinemanagement.repository;

import org.cine.cinemanagement.model.Theater;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TheaterRepository extends JpaRepository<Theater, Long> {
    public Theater findByTheaterName(String name);
}
