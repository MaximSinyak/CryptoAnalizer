package ru.javarush.msinyak.cryptoanalizer.exceptions;

public class AppExeption extends RuntimeException{
    public AppExeption() {
    }

    public AppExeption(String message) {
        super(message);
    }

    public AppExeption(String message, Throwable cause) {
        super(message, cause);
    }

    public AppExeption(Throwable cause) {
        super(cause);
    }
}
