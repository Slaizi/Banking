package ru.Bogachev.cqrsbankingapp.service.transaction;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.Bogachev.cqrsbankingapp.domain.model.Transaction;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class TransactionServiceImpl implements TransactionService {
    private TransactionCommandService commandService;
    private TransactionQueryService queryService;

    @Override
    public void create(Transaction object) {
        commandService.create(object);
    }

    @Override
    public Transaction getById(UUID id) {
        return queryService.getById(id);
    }
}
