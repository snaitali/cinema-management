package org.cine.cinemanagement.service;

import org.cine.cinemanagement.model.Movie;

import java.util.List;

public interface MovieService {

    List<Movie> findAllMovies();

    Movie findMovieById(Long id);

    Movie findMovieByName(String name);

    Movie saveMovie(Movie movie);
}
