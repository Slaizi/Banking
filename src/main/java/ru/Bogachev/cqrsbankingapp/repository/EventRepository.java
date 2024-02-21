package ru.Bogachev.cqrsbankingapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.Bogachev.cqrsbankingapp.events.AbstractEvent;

public interface EventRepository extends JpaRepository<AbstractEvent, Long> {
}
