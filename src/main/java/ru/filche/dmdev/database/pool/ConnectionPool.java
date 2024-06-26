package ru.filche.dmdev.database.pool;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Value;

@Component("pool1")
public class ConnectionPool {
    private final String username;
    private final Integer poolSize;

    public ConnectionPool(@Value("${db.username}") String username,
                          @Value("${db.pool.size}") Integer poolSize) {
        this.username = username;
        this.poolSize = poolSize;

    }

    @PostConstruct
    public void init(){
        System.out.println("Bean has been initialized");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("Bean has been destroyed");
    }
}
