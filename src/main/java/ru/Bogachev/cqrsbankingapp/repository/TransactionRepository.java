package ru.Bogachev.cqrsbankingapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.Bogachev.cqrsbankingapp.domain.model.Transaction;

import java.util.UUID;

public interface TransactionRepository extends JpaRepository<Transaction, UUID> {
}
