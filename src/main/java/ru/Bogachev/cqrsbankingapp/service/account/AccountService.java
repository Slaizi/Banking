package ru.Bogachev.cqrsbankingapp.service.account;

import ru.Bogachev.cqrsbankingapp.domain.model.Account;
import ru.Bogachev.cqrsbankingapp.service.CommandService;
import ru.Bogachev.cqrsbankingapp.service.QueryService;

public interface AccountService
        extends QueryService<Account>, CommandService<Account> {

}
