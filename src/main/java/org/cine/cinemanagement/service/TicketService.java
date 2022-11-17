package org.cine.cinemanagement.service;

import org.cine.cinemanagement.model.Ticket;

import java.util.List;

public interface TicketService {

    List<Ticket> findAllTickets();

    Ticket findTicketById(Long id);

    Ticket saveTicket(Ticket ticket);
}
