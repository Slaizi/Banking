package ru.Bogachev.cqrsbankingapp.web.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.Bogachev.cqrsbankingapp.domain.model.Client;
import ru.Bogachev.cqrsbankingapp.service.client.ClientService;
import ru.Bogachev.cqrsbankingapp.web.dto.AccountDto;
import ru.Bogachev.cqrsbankingapp.web.dto.CardDto;
import ru.Bogachev.cqrsbankingapp.web.dto.ClientDto;
import ru.Bogachev.cqrsbankingapp.web.dto.mapper.AccountMapper;
import ru.Bogachev.cqrsbankingapp.web.dto.mapper.CardMapper;
import ru.Bogachev.cqrsbankingapp.web.dto.mapper.ClientMapper;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/v1/clients")
@RequiredArgsConstructor
public class ClientController {
    private final ClientService clientService;
    private final ClientMapper clientMapper;
    private final CardMapper cardMapper;
    private final AccountMapper accountMapper;

    @GetMapping("/{id}")
    public ClientDto getById(
            @PathVariable final UUID id
    ) {
        Client client = clientService.getById(id);
        return clientMapper.toDto(client);
    }

    @GetMapping("/{id}/card")
    public List<CardDto> getCardById(
            @PathVariable final UUID id
    ) {
        Client client = clientService.getById(id);
        return cardMapper.toDto(client.getCards());
    }

    @GetMapping("/{id}/account")
    public AccountDto getAccountById(
            @PathVariable final UUID id
    ) {
        Client client = clientService.getById(id);
        return accountMapper.toDto(client.getAccount());
    }
}
