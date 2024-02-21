package ru.Bogachev.cqrsbankingapp.events;

import ru.Bogachev.cqrsbankingapp.domain.aggregate.Aggregate;

public interface Event {
    void apply(Aggregate aggregate);
}
