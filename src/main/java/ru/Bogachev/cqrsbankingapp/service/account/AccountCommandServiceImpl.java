package ru.Bogachev.cqrsbankingapp.service.account;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.Bogachev.cqrsbankingapp.domain.model.Account;
import ru.Bogachev.cqrsbankingapp.events.AccountCreateEvent;
import ru.Bogachev.cqrsbankingapp.service.event.EventService;

@Service
@RequiredArgsConstructor
public class AccountCommandServiceImpl implements AccountCommandService {
    private EventService eventService;

    @Override
    public void create(Account account) {
        AccountCreateEvent event = new AccountCreateEvent(account);
        eventService.create(event);
    }
}
