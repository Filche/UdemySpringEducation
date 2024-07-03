package ru.filche.dmdev.spring.database.repository;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;
import ru.filche.dmdev.spring.database.pool.ConnectionPool;
import org.springframework.beans.factory.annotation.Qualifier;

@Repository
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class UserRepository {

    private final ConnectionPool pool2;

    public UserRepository(@Qualifier("pool2") ConnectionPool pool2) {
        this.pool2 = pool2;
    }
}