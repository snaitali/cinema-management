package org.cine.cinemanagement.service;

import org.cine.cinemanagement.model.Session;

import java.util.List;

public interface SessionService {
    List<Session> findAllSessions();

    Session findSessionById(Long id);

    Session saveSession(Session session);
}
