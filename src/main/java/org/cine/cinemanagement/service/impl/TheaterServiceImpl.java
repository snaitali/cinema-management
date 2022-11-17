package org.cine.cinemanagement.service.impl;

import org.cine.cinemanagement.model.Theater;
import org.cine.cinemanagement.repository.TheaterRepository;
import org.cine.cinemanagement.service.TheaterService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
@Transactional
public class TheaterServiceImpl implements TheaterService {

    private TheaterRepository theaterRepository;

    public TheaterServiceImpl(TheaterRepository theaterRepository) {
        this.theaterRepository = theaterRepository;
    }

    @Override
    public List<Theater> findAllTheaters() {
        return theaterRepository.findAll();
    }

    @Override
    public Theater findTheaterById(Long id) {

        return theaterRepository.findById(id).get();
    }

    @Override
    public Theater findTheaterByName(String name) {

        return theaterRepository.findByTheaterName(name);
    }

    @Override
    public Theater saveTheater(Theater theater) {

        return theaterRepository.save(theater);
    }
}
