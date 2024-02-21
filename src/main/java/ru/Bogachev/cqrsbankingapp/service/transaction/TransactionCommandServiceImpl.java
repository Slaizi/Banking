package ru.Bogachev.cqrsbankingapp.service.transaction;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.Bogachev.cqrsbankingapp.domain.model.Transaction;
import ru.Bogachev.cqrsbankingapp.events.TransactionCreateEvent;
import ru.Bogachev.cqrsbankingapp.service.event.EventService;

@Service
@RequiredArgsConstructor
public class TransactionCommandServiceImpl implements TransactionCommandService {
    private EventService eventService;
    @Override
    public void create(Transaction transaction) {
        TransactionCreateEvent event = new TransactionCreateEvent(transaction);
        eventService.create(event);
    }
}
