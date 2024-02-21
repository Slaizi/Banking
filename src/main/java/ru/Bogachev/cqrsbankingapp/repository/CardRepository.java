package ru.Bogachev.cqrsbankingapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.Bogachev.cqrsbankingapp.domain.model.Card;

import java.util.UUID;

public interface CardRepository extends JpaRepository<Card, UUID> {
}
