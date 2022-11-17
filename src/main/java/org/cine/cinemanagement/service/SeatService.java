package org.cine.cinemanagement.service;

import org.cine.cinemanagement.model.Seat;

import java.util.List;

public interface SeatService {

    List<Seat> findAllSeats();

    Seat findSeatById(Long id);

    Seat saveSeat(Seat seat);
}
