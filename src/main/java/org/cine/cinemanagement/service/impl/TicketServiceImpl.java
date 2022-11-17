package org.cine.cinemanagement.service.impl;

import org.cine.cinemanagement.model.Ticket;
import org.cine.cinemanagement.repository.TicketRepository;
import org.cine.cinemanagement.service.TicketService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class TicketServiceImpl implements TicketService {

    private TicketRepository ticketRepository;

    public TicketServiceImpl(TicketRepository ticketRepository) {
        this.ticketRepository = ticketRepository;
    }

    @Override
    public List<Ticket> findAllTickets() {
        return ticketRepository.findAll();
    }

    @Override
    public Ticket findTicketById(Long id) {

        return ticketRepository.findById(id).get();
    }

    @Override
    public Ticket saveTicket(Ticket ticket) {

        return ticketRepository.save(ticket);
    }
}
