package ru.Bogachev.cqrsbankingapp.web.dto.mapper;

import org.mapstruct.Mapper;
import ru.Bogachev.cqrsbankingapp.domain.model.Account;
import ru.Bogachev.cqrsbankingapp.web.dto.AccountDto;

@Mapper(componentModel = "spring")
public interface AccountMapper extends Mappable<Account, AccountDto> {
}
