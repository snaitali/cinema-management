package org.cine.cinemanagement.service.impl;

import org.cine.cinemanagement.model.Seat;
import org.cine.cinemanagement.repository.SeatRepository;
import org.cine.cinemanagement.service.SeatService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class SeatServiceImpl implements SeatService {

    private SeatRepository seatRepository;

    public SeatServiceImpl(SeatRepository seatRepository) {
        this.seatRepository = seatRepository;
    }

    @Override
    public List<Seat> findAllSeats() {
        return seatRepository.findAll();
    }

    @Override
    public Seat findSeatById(Long id) {

        return seatRepository.findById(id).get();
    }

    @Override
    public Seat saveSeat(Seat seat) {

        return seatRepository.save(seat);
    }
}
