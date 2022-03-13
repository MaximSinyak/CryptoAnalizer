package ru.javarush.msinyak.cryptoanalizer;

import ru.javarush.msinyak.cryptoanalizer.controllers.MainController;
import ru.javarush.msinyak.cryptoanalizer.entity.Result;
import ru.javarush.msinyak.cryptoanalizer.exceptions.AppExeption;

import java.util.Arrays;

public class Application {

    private final MainController mainController;

    public Application() {
        mainController = new MainController();
    }

    public Result run(String[] args) {
        if (args.length > 0){
            String action = args[0];
            String[] parameters = Arrays.copyOfRange(args, 1, args.length - 1);
            Result result = mainController.doAction(action, parameters);
        }
        throw new AppExeption();
    }
}
