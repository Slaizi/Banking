package ru.Bogachev.cqrsbankingapp.web.dto;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Null;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
public class CardDto {
    @NotNull(
            message = "Id must be not null.",
            groups = OnUpdate.class
    )
    @Null(
            message = "Id must be null.",
            groups = OnCreate.class
    )
    private UUID id;

    @NotNull(
            message = "Card number must be not null.",
            groups = OnCreate.class
    )
    @Null(
            message = "Card number must be null."

    )
    private String number;

    @NotNull(
            message = "Card date must be not null.",
            groups = OnCreate.class
    )
    @Null(
            message = "Card date must be null."
    )
    private String date;

    @NotNull(
            message = "Card cvv must be not null.",
            groups = OnCreate.class
    )
    @Null(
            message = "Card cvv must be null."

    )
    private String cvv;
}
