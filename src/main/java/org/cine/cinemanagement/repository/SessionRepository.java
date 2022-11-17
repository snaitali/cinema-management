package org.cine.cinemanagement.repository;

import org.cine.cinemanagement.model.Session;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SessionRepository extends JpaRepository<Session, Long> {
}
