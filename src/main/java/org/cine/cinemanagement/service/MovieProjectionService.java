package org.cine.cinemanagement.service;

import org.cine.cinemanagement.model.MovieProjection;

import java.util.List;

public interface MovieProjectionService {

    List<MovieProjection> findAllProjections();

    MovieProjection findProjectionById(Long id);

    MovieProjection saveProjection(MovieProjection projection);
}
