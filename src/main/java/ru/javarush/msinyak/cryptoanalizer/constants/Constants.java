package ru.javarush.msinyak.cryptoanalizer.constants;

import java.io.File;

public class Constants {
    private  static final String RUS = "АБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯ";
    private  static final String ENG = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private  static final String NUMBERS = "0123456789";
    private  static final String SYMBOLS = "!@#$%^&*(){}:;|[]?<>+=_-.,\s\n\t\"\'\\";

    public   static final String ALPHABET = RUS + RUS.toLowerCase() + ENG + ENG.toLowerCase() +
            NUMBERS + SYMBOLS;

    public static final String TXT_FOLDER = System.getProperty("user.dir") +
            File.separator + "text" + File.separator;
}
