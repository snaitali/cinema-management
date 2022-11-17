package org.cine.cinemanagement.service.impl;

import org.cine.cinemanagement.model.Cinema;
import org.cine.cinemanagement.repository.CinemaRepository;
import org.cine.cinemanagement.service.CinemaService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class CinemaServiceImpl implements CinemaService {

    private CinemaRepository cinemaRepository;

    public CinemaServiceImpl(CinemaRepository cinemaRepository) {
        this.cinemaRepository = cinemaRepository;
    }

    @Override
    public List<Cinema> findAllCinemas() {
        return cinemaRepository.findAll();
    }

    @Override
    public Cinema findCinemaById(Long id) {

        return cinemaRepository.findById(id).get();
    }

    @Override
    public Cinema findCinemaByName(String name) {
        return cinemaRepository.findByName(name);
    }


    @Override
    public Cinema saveCinema(Cinema cinema) {

        return cinemaRepository.save(cinema);
    }
}
