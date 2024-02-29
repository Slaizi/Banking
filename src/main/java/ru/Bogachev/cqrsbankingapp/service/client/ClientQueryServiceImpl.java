package ru.Bogachev.cqrsbankingapp.service.client;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.Bogachev.cqrsbankingapp.domain.exception.ResourceNotFoundException;
import ru.Bogachev.cqrsbankingapp.domain.model.Client;
import ru.Bogachev.cqrsbankingapp.repository.ClientRepository;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class ClientQueryServiceImpl implements ClientQueryService {
    private final ClientRepository repository;

    @Override
    public Client getById(UUID id) {
        return repository.findById(id)
                .orElseThrow(ResourceNotFoundException::new);
    }

    @Override
    public boolean existsByUsername(String username) {
        return repository.existsByUsername(username);
    }
}
