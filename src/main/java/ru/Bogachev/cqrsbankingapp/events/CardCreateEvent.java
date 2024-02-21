package ru.Bogachev.cqrsbankingapp.events;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ru.Bogachev.cqrsbankingapp.domain.aggregate.Aggregate;
import ru.Bogachev.cqrsbankingapp.domain.model.Card;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class CardCreateEvent extends AbstractEvent {
    public CardCreateEvent(Card payload) {
        super(null, EventType.CARD_CREATE, payload);
    }

    @Override
    public void apply(Aggregate aggregate) {

    }
}
