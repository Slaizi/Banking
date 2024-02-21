package ru.Bogachev.cqrsbankingapp.service.card;

import ru.Bogachev.cqrsbankingapp.domain.model.Card;
import ru.Bogachev.cqrsbankingapp.service.CommandService;
import ru.Bogachev.cqrsbankingapp.service.QueryService;

public interface CardService
        extends QueryService<Card>, CommandService<Card> {
}
