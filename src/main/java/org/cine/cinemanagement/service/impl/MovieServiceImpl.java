package org.cine.cinemanagement.service.impl;

import org.cine.cinemanagement.model.Movie;
import org.cine.cinemanagement.repository.MovieRepository;
import org.cine.cinemanagement.service.MovieService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class MovieServiceImpl implements MovieService {

    private MovieRepository movieRepository;

    public MovieServiceImpl(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    @Override
    public List<Movie> findAllMovies() {
        return movieRepository.findAll();
    }

    @Override
    public Movie findMovieById(Long id) {

        return movieRepository.findById(id).get();
    }

    @Override
    public Movie findMovieByName(String name) {

        return movieRepository.findByName(name);
    }

    @Override
    public Movie saveMovie(Movie movie) {

        return movieRepository.save(movie);
    }
}
