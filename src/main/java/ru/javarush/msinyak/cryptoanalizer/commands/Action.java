package ru.javarush.msinyak.cryptoanalizer.commands;

import ru.javarush.msinyak.cryptoanalizer.entity.Result;

public interface Action {
    Result execute(String[] parameters);
}
