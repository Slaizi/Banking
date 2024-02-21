package ru.Bogachev.cqrsbankingapp.service.client;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.Bogachev.cqrsbankingapp.domain.model.Client;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class ClientServiceImpl implements ClientService {
    private ClientCommandService commandService;
    private ClientQueryService queryService;

    @Override
    public void create(Client object) {
        commandService.create(object);
    }

    @Override
    public Client getById(UUID id) {
        return queryService.getById(id);
    }
}
