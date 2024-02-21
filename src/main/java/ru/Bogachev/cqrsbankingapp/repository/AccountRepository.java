package ru.Bogachev.cqrsbankingapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.Bogachev.cqrsbankingapp.domain.model.Account;

import java.util.UUID;

public interface AccountRepository extends JpaRepository<Account, UUID> {
}
