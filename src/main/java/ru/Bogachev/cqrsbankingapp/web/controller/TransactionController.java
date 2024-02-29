package ru.Bogachev.cqrsbankingapp.web.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import ru.Bogachev.cqrsbankingapp.domain.model.Transaction;
import ru.Bogachev.cqrsbankingapp.service.card.CardService;
import ru.Bogachev.cqrsbankingapp.service.transaction.TransactionService;
import ru.Bogachev.cqrsbankingapp.web.dto.OnCreate;
import ru.Bogachev.cqrsbankingapp.web.dto.TransactionDto;
import ru.Bogachev.cqrsbankingapp.web.dto.mapper.TransactionMapper;

import java.util.UUID;

@RestController
@RequestMapping("/api/v1/transactions")
@RequiredArgsConstructor
public class TransactionController {

    private final TransactionService transactionService;
    private final CardService cardService;
    private final TransactionMapper transactionMapper;


    @PostMapping
    public void create(
            @RequestBody @Validated(OnCreate.class) final TransactionDto dto
    ) {
        if (!cardService.existsByNumberAndDate(
                dto.getTo().getNumber(),
                dto.getTo().getDate()
        )) {
            throw new IllegalArgumentException("Card does not exists.");
        }

        Transaction transaction = transactionMapper.toEntity(dto);
        transactionService.create(transaction);
    }

    @GetMapping("/{id}")
    public TransactionDto getById(
            @PathVariable final UUID id
    ) {
        Transaction transaction = transactionService.getById(id);
        return transactionMapper.toDto(transaction);
    }
}
