package ru.javarush.msinyak.cryptoanalizer.commands;

import ru.javarush.msinyak.cryptoanalizer.entity.Result;
import ru.javarush.msinyak.cryptoanalizer.entity.ResultCode;

public class BrudeForce implements Action{
    @Override
    public Result execute(String[] parameters) {
        //TODO something do
        return new Result("brudeForce complete", ResultCode.OK);
    }
}
