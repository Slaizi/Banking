package ru.Bogachev.cqrsbankingapp.service.transaction;

import ru.Bogachev.cqrsbankingapp.domain.model.Transaction;
import ru.Bogachev.cqrsbankingapp.service.CommandService;

public interface TransactionCommandService extends CommandService<Transaction> {
}
