package ru.Bogachev.cqrsbankingapp.service.transaction;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.Bogachev.cqrsbankingapp.domain.exception.ResourceNotFoundException;
import ru.Bogachev.cqrsbankingapp.domain.model.Transaction;
import ru.Bogachev.cqrsbankingapp.repository.TransactionRepository;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class TransactionQueryServiceImpl implements TransactionQueryService {
    private final TransactionRepository repository;

    @Override
    public Transaction getById(UUID id) {
        return repository.findById(id)
                .orElseThrow(ResourceNotFoundException::new);
    }
}
