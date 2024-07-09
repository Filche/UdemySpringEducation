package ru.filche.dmdev.spring.database.repository;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;
import ru.filche.dmdev.spring.database.pool.ConnectionPool;
import org.springframework.beans.factory.annotation.Qualifier;

@Repository
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
@RequiredArgsConstructor
public class UserRepository {
    @Qualifier("pool2")
    private final ConnectionPool pool2;
}