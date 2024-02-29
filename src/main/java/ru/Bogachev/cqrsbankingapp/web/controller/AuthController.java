package ru.Bogachev.cqrsbankingapp.web.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.Bogachev.cqrsbankingapp.domain.model.Client;
import ru.Bogachev.cqrsbankingapp.service.auth.AuthService;
import ru.Bogachev.cqrsbankingapp.web.dto.ClientDto;
import ru.Bogachev.cqrsbankingapp.web.dto.LoginRequestDto;
import ru.Bogachev.cqrsbankingapp.web.dto.LoginResponseDto;
import ru.Bogachev.cqrsbankingapp.web.dto.OnCreate;
import ru.Bogachev.cqrsbankingapp.web.dto.mapper.ClientMapper;

@RestController
@RequestMapping("/api/v1/auth")
@RequiredArgsConstructor
public class AuthController {

    private final AuthService authService;
    private final ClientMapper clientMapper;

    @PostMapping("/register")
    public void register(
            @RequestBody @Validated(OnCreate.class) final ClientDto dto
    ) {
        Client client = clientMapper.toEntity(dto);
        authService.register(client);
    }

    @PostMapping("/login")
    public LoginResponseDto login(
            @RequestBody @Validated final LoginRequestDto dto
    ) {
        return authService.login(dto);
    }

}
