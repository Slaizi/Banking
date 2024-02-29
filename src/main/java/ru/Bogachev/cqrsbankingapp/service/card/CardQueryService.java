package ru.Bogachev.cqrsbankingapp.service.card;

import ru.Bogachev.cqrsbankingapp.domain.model.Card;
import ru.Bogachev.cqrsbankingapp.service.QueryService;

public interface CardQueryService extends QueryService<Card> {
    boolean existsByNumberAndDate(String cardNumber, String cardDate);
}
