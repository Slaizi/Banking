package ru.Bogachev.cqrsbankingapp.service.event;

import ru.Bogachev.cqrsbankingapp.events.AbstractEvent;

public interface EventService {

    void create(AbstractEvent event);

}
