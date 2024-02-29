package ru.Bogachev.cqrsbankingapp.web.dto.mapper;

import org.mapstruct.Mapper;
import ru.Bogachev.cqrsbankingapp.domain.model.Card;
import ru.Bogachev.cqrsbankingapp.web.dto.CardDto;

@Mapper(componentModel = "spring")
public interface CardMapper extends Mappable<Card, CardDto> {
}
