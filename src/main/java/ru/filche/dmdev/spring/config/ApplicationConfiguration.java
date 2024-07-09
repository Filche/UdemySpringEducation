package ru.filche.dmdev.spring.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.*;
import ru.filche.dmdev.spring.database.pool.ConnectionPool;
import ru.filche.dmdev.spring.database.repository.UserRepository;
import ru.filche.dmdev.web.config.WebConfiguration;

@Import({WebConfiguration.class})
@Configuration
public class ApplicationConfiguration {

    @Bean("pool2")
    @Scope(BeanDefinition.SCOPE_SINGLETON)
    public ConnectionPool pool2(@Value("${db.username}") String username){
        return new ConnectionPool(username, 122);
    }

    @Bean
    public ConnectionPool pool3(){
        return new ConnectionPool("test-pool", 25);
    }

    @Bean
    @Profile("prod")
    public UserRepository userRepository2(@Qualifier("pool2") ConnectionPool pool2){
        return new UserRepository(pool2);
    }

    @Bean
    public UserRepository userRepository3(@Qualifier("pool3") ConnectionPool pool3){
        return new UserRepository(pool3);
    }

}
