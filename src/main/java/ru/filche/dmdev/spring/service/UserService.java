package ru.filche.dmdev.spring.service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import ru.filche.dmdev.spring.database.entity.Company;
import ru.filche.dmdev.spring.database.repository.CrudRepository;
import ru.filche.dmdev.spring.database.repository.UserRepository;

@Service
public class UserService {

    private final UserRepository userRepository;
    private final CrudRepository<Integer, Company> companyRepository;

    public UserService(@Qualifier("userRepository") UserRepository userRepository,
                       CrudRepository<Integer, Company> companyRepository) {
        this.userRepository = userRepository;
        this.companyRepository = companyRepository;
    }
}