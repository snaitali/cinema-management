package org.cine.cinemanagement.service.impl;

import org.cine.cinemanagement.model.Session;
import org.cine.cinemanagement.repository.SessionRepository;
import org.cine.cinemanagement.service.SessionService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
@Transactional
public class SessionServiceImpl implements SessionService {

    private SessionRepository sessionRepository;

    public SessionServiceImpl(SessionRepository sessionRepository) {
        this.sessionRepository = sessionRepository;
    }

    @Override
    public List<Session> findAllSessions() {
        return sessionRepository.findAll();
    }

    @Override
    public Session findSessionById(Long id) {

        return sessionRepository.findById(id).get();
    }

    @Override
    public Session saveSession(Session session) {

        return sessionRepository.save(session);
    }
}
