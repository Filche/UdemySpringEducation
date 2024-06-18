package ru.filche.dmdev.database.repository;

import org.springframework.stereotype.Repository;
import ru.filche.dmdev.database.pool.ConnectionPool;

@Repository
public class UserRepository {

    private final ConnectionPool connectionPool;

    public UserRepository(ConnectionPool connectionPool) {
        this.connectionPool = connectionPool;
    }
}