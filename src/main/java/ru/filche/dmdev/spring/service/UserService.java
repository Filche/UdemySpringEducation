package ru.filche.dmdev.spring.service;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import ru.filche.dmdev.spring.database.entity.Company;
import ru.filche.dmdev.spring.database.repository.CrudRepository;
import ru.filche.dmdev.spring.database.repository.UserRepository;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;
    private final CrudRepository<Integer, Company> companyRepository;
}