package ru.javarush.msinyak.cryptoanalizer.commands;

import ru.javarush.msinyak.cryptoanalizer.entity.Result;
import ru.javarush.msinyak.cryptoanalizer.entity.ResultCode;

public class Decoder implements Action{
    @Override
    public Result execute(String[] parameters) {
        //TODO something do
        return new Result("decode all right", ResultCode.OK);
    }
}
