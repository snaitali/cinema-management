package org.cine.cinemanagement.repository;

import org.cine.cinemanagement.model.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TicketRepository extends JpaRepository<Ticket,Long> {
}
