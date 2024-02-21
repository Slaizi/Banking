package ru.Bogachev.cqrsbankingapp.service.card;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.Bogachev.cqrsbankingapp.domain.model.Card;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class CardServiceImpl implements CardService {
    private CardCommandService commandService;
    private CardQueryService queryService;

    @Override
    public void create(Card object) {
        commandService.create(object);
    }

    @Override
    public Card getById(UUID id) {
        return queryService.getById(id);
    }
}
