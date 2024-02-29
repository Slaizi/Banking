package ru.Bogachev.cqrsbankingapp.service.auth;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.Bogachev.cqrsbankingapp.domain.exception.ResourceAlreadyExistsException;
import ru.Bogachev.cqrsbankingapp.domain.model.Client;
import ru.Bogachev.cqrsbankingapp.service.client.ClientService;
import ru.Bogachev.cqrsbankingapp.web.dto.LoginRequestDto;
import ru.Bogachev.cqrsbankingapp.web.dto.LoginResponseDto;

@Service
@RequiredArgsConstructor
public class AuthServiceImpl implements AuthService {

    private final ClientService clientService;

    @Override
    public LoginResponseDto login(LoginRequestDto request) {
        //TODO implement
        return null;
    }

    @Override
    public void register(Client client) {
        if (clientService.existsByUsername(client.getUsername())) {
            throw new ResourceAlreadyExistsException();
        }
        //TODO hash password
        client.setPassword(client.getPassword());
        clientService.create(client);
    }
}
