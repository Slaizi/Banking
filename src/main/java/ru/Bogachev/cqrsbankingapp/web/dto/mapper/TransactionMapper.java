package ru.Bogachev.cqrsbankingapp.web.dto.mapper;

import org.mapstruct.Mapper;
import ru.Bogachev.cqrsbankingapp.domain.model.Transaction;
import ru.Bogachev.cqrsbankingapp.web.dto.TransactionDto;

@Mapper(componentModel = "spring")
public interface TransactionMapper extends Mappable<Transaction, TransactionDto> {
}
