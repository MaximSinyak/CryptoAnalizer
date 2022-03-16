package ru.javarush.msinyak.cryptoanalizer.controllers;

import ru.javarush.msinyak.cryptoanalizer.commands.Action;
import ru.javarush.msinyak.cryptoanalizer.entity.Result;

public class MainController {
    public Result doAction(String actionName, String[] parameters){
        Action action = Actions.find(actionName);
        return action.execute(parameters);
    }
}
