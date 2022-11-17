package org.cine.cinemanagement.controller;

import org.cine.cinemanagement.model.Cinema;
import org.cine.cinemanagement.service.CinemaService;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class CinemaController {

    private CinemaService cinemaService;

    public CinemaController(CinemaService cinemaService) {
        this.cinemaService = cinemaService;
    }

    @QueryMapping
    public List<Cinema> getAllCinemas() {
        return cinemaService.findAllCinemas();
    }

    @QueryMapping
    public Cinema findCinemaById(@Argument Long id) {
        return cinemaService.findCinemaById(id);
    }

    @MutationMapping
    public Cinema addCinema(@Argument Cinema cinema) {
        return cinemaService.saveCinema(cinema);
    }
}
