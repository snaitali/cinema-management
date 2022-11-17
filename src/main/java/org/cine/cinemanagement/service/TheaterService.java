package org.cine.cinemanagement.service;

import org.cine.cinemanagement.model.Theater;

import java.util.List;

public interface TheaterService {

    List<Theater> findAllTheaters();

    Theater findTheaterById(Long id);

    Theater findTheaterByName(String name);

    Theater saveTheater(Theater theater);
}
