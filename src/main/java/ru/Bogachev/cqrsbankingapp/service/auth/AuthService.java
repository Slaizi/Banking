package ru.Bogachev.cqrsbankingapp.service.auth;

import ru.Bogachev.cqrsbankingapp.domain.model.Client;
import ru.Bogachev.cqrsbankingapp.web.dto.LoginRequestDto;
import ru.Bogachev.cqrsbankingapp.web.dto.LoginResponseDto;

public interface AuthService {
    LoginResponseDto login(LoginRequestDto request);

    void register(Client client);
}
