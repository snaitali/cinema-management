package org.cine.cinemanagement.service;

import org.cine.cinemanagement.model.Cinema;

import java.util.List;

public interface CinemaService {

    List<Cinema> findAllCinemas();

    Cinema findCinemaById(Long id);

    Cinema findCinemaByName(String name);

    Cinema saveCinema(Cinema cinema);
}
