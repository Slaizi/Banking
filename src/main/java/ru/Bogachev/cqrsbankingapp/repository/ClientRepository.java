package ru.Bogachev.cqrsbankingapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.Bogachev.cqrsbankingapp.domain.model.Client;

import java.util.UUID;

public interface ClientRepository extends JpaRepository<Client, UUID> {
    boolean existsByUsername(String username);
}
