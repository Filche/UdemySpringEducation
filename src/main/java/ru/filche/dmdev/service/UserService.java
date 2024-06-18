package ru.filche.dmdev.service;

import org.springframework.stereotype.Service;
import ru.filche.dmdev.database.entity.Company;
import ru.filche.dmdev.database.repository.CrudRepository;
import ru.filche.dmdev.database.repository.UserRepository;

@Service
public class UserService {

    private final UserRepository userRepository;
    private final CrudRepository<Integer, Company> companyRepository;

    public UserService(UserRepository userRepository,
                       CrudRepository<Integer, Company> companyRepository) {
        this.userRepository = userRepository;
        this.companyRepository = companyRepository;
    }
}