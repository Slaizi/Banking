package ru.Bogachev.cqrsbankingapp.service.transaction;

import ru.Bogachev.cqrsbankingapp.domain.model.Transaction;
import ru.Bogachev.cqrsbankingapp.service.CommandService;
import ru.Bogachev.cqrsbankingapp.service.QueryService;

public interface TransactionService
        extends QueryService<Transaction>, CommandService<Transaction> {
}
