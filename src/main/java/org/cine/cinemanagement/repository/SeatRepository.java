package org.cine.cinemanagement.repository;

import org.cine.cinemanagement.model.Seat;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SeatRepository extends JpaRepository<Seat, Long> {
}
