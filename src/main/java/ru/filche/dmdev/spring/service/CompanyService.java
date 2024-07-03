package ru.filche.dmdev.spring.service;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;
import ru.filche.dmdev.spring.database.entity.Company;
import ru.filche.dmdev.spring.database.repository.CrudRepository;
import ru.filche.dmdev.spring.dto.CompanyReadDto;
import ru.filche.dmdev.spring.listener.entity.AccessType;
import ru.filche.dmdev.spring.listener.entity.EntityEvent;

import java.util.Optional;

@Service
public class CompanyService {
    private final UserService userService;
    private final CrudRepository<Integer, Company> companyRepository;
    private final ApplicationEventPublisher eventPublisher;

    public CompanyService(UserService userService,
                          CrudRepository<Integer, Company> companyRepository,
                          ApplicationEventPublisher eventPublisher) {
        this.userService = userService;
        this.companyRepository = companyRepository;
        this.eventPublisher = eventPublisher;
    }

    public Optional<CompanyReadDto> findById(Integer id){
        return companyRepository.findById(id)
                .map(entity -> {
                    eventPublisher.publishEvent(new EntityEvent(entity, AccessType.READ));
                    return new CompanyReadDto(entity.getId());
                });
    }
}
