package ru.javarush.msinyak.cryptoanalizer.controllers;

import ru.javarush.msinyak.cryptoanalizer.commands.Action;
import ru.javarush.msinyak.cryptoanalizer.commands.Decoder;
import ru.javarush.msinyak.cryptoanalizer.commands.Encoder;
import ru.javarush.msinyak.cryptoanalizer.exceptions.AppExeption;

public enum Actions {
    ENCODE(new Encoder()),
    DECODE(new Decoder());

    private final Action action;

    Actions(Action action){
        this.action = action;
    }

    public static Action find(String actionName){
        try {
            Actions value = Actions.valueOf(actionName.toLowerCase());
            return value.action;
        } catch (IllegalArgumentException e){
            throw new AppExeption("not found " + actionName, e);
        }

    }
}
