package org.cine.cinemanagement.service.impl;

import org.cine.cinemanagement.model.MovieProjection;
import org.cine.cinemanagement.repository.MovieProjectionRepository;
import org.cine.cinemanagement.service.MovieProjectionService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class MovieProjectionServiceImpl implements MovieProjectionService {

    private MovieProjectionRepository movieProjectionRepository;

    public MovieProjectionServiceImpl(MovieProjectionRepository movieProjectionRepository) {
        this.movieProjectionRepository = movieProjectionRepository;
    }

    @Override
    public List<MovieProjection> findAllProjections() {
        return movieProjectionRepository.findAll();
    }

    @Override
    public MovieProjection findProjectionById(Long id) {

        return movieProjectionRepository.findById(id).get();
    }

    @Override
    public MovieProjection saveProjection(MovieProjection projection) {

        return movieProjectionRepository.save(projection);
    }
}
