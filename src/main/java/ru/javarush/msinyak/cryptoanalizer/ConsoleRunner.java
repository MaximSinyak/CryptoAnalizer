package ru.javarush.msinyak.cryptoanalizer;

import ru.javarush.msinyak.cryptoanalizer.constants.Constants;
import ru.javarush.msinyak.cryptoanalizer.entity.Result;
import java.util.Arrays;

public class ConsoleRunner {
    public static void main(String[] args) {

        Application application = new Application();
        Result result = application.run(args);
        System.out.println(result);
        String txtFolder = Constants.TXT_FOLDER;
    }
}
