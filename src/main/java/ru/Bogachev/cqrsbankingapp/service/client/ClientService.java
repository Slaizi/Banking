package ru.Bogachev.cqrsbankingapp.service.client;

import ru.Bogachev.cqrsbankingapp.domain.model.Account;
import ru.Bogachev.cqrsbankingapp.domain.model.Client;
import ru.Bogachev.cqrsbankingapp.service.CommandService;
import ru.Bogachev.cqrsbankingapp.service.QueryService;

public interface ClientService
        extends QueryService<Client>, CommandService<Client> {
}
