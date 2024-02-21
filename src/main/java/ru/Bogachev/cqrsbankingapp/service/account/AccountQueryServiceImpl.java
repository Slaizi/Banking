package ru.Bogachev.cqrsbankingapp.service.account;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.Bogachev.cqrsbankingapp.domain.model.Account;
import ru.Bogachev.cqrsbankingapp.repository.AccountRepository;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class AccountQueryServiceImpl implements AccountQueryService {
    private final AccountRepository repository;

    @Override
    public Account getById(UUID id) {
       return repository.findById(id)
               .orElseThrow(RuntimeException::new);
    }
}
