package ru.Bogachev.cqrsbankingapp.service;

public interface CommandService<T> {
    void create(T object);
}
