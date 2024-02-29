package ru.Bogachev.cqrsbankingapp.web.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import ru.Bogachev.cqrsbankingapp.domain.model.Card;
import ru.Bogachev.cqrsbankingapp.service.card.CardService;
import ru.Bogachev.cqrsbankingapp.web.dto.CardDto;
import ru.Bogachev.cqrsbankingapp.web.dto.TransactionDto;
import ru.Bogachev.cqrsbankingapp.web.dto.mapper.CardMapper;
import ru.Bogachev.cqrsbankingapp.web.dto.mapper.TransactionMapper;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/v1/cards")
@RequiredArgsConstructor
public class CardController {
    private final CardService cardService;
    private final CardMapper cardMapper;
    private final TransactionMapper transactionMapper;


    @PostMapping
    public void create() {
        //TODO implement
        UUID id = UUID.randomUUID();
        cardService.createByClientId(id);
    }

    @GetMapping("/{id}")
    public CardDto getById(
            @PathVariable final UUID id
    ) {
        Card card = cardService.getById(id);
        return cardMapper.toDto(card);
    }

    @GetMapping("/{id}/transactions")
    public List<TransactionDto> getTransactionsById(
            @PathVariable final UUID id
    ) {
        Card card = cardService.getById(id);
        return transactionMapper.toDto(card.getTransactions());
    }
}
