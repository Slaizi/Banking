package ru.Bogachev.cqrsbankingapp.events;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ru.Bogachev.cqrsbankingapp.domain.aggregate.Aggregate;
import ru.Bogachev.cqrsbankingapp.domain.model.Account;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class AccountCreateEvent extends AbstractEvent {
    public AccountCreateEvent(Account payload) {
        super(null, EventType.ACCOUNT_CREATE, payload);
    }

    @Override
    public void apply(Aggregate aggregate) {

    }
}
