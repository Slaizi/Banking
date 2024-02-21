package ru.Bogachev.cqrsbankingapp.service.card;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.Bogachev.cqrsbankingapp.domain.model.Card;
import ru.Bogachev.cqrsbankingapp.events.CardCreateEvent;
import ru.Bogachev.cqrsbankingapp.service.event.EventService;

@Service
@RequiredArgsConstructor
public class CardCommandServiceImpl implements CardCommandService {
    private EventService eventService;

    @Override
    public void create(Card card) {
        CardCreateEvent event = new CardCreateEvent(card);
        eventService.create(event);
    }
}
