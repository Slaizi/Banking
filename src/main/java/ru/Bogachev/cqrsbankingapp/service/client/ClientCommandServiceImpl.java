package ru.Bogachev.cqrsbankingapp.service.client;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.Bogachev.cqrsbankingapp.domain.model.Client;
import ru.Bogachev.cqrsbankingapp.events.ClientCreateEvent;
import ru.Bogachev.cqrsbankingapp.service.event.EventService;

@Service
@RequiredArgsConstructor
public class ClientCommandServiceImpl implements ClientCommandService {
    private EventService eventService;
    @Override
    public void create(Client client) {
        ClientCreateEvent event = new ClientCreateEvent(client);
        eventService.create(event);
    }
}
