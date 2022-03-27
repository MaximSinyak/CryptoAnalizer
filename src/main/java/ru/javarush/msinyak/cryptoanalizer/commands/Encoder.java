package ru.javarush.msinyak.cryptoanalizer.commands;

import ru.javarush.msinyak.cryptoanalizer.constants.Constants;
import ru.javarush.msinyak.cryptoanalizer.entity.Result;
import ru.javarush.msinyak.cryptoanalizer.entity.ResultCode;

import java.io.*;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Encoder implements Action{
    @Override
    public Result execute(String[] parameters) {
        //TODO something do
        int getKey = Integer.parseInt(parameters[parameters.length - 1]);
            char[] alphabet = Constants.ALPHABET.toCharArray();
            char[] alphabetCode = new char[alphabet.length];
            for (int i = 0; i < alphabet.length; i++) {
                int n;
                if (alphabet.length > i + getKey) {
                    n = i + getKey;
                } else {
                    n = i + getKey - alphabet.length;
                }
                alphabetCode[i] = alphabet[n];
            }
            try (BufferedReader reader = new BufferedReader(new FileReader(Constants.TXT_FOLDER + parameters[0]));
                 PrintStream filePrintStream = new PrintStream(Constants.TXT_FOLDER + parameters[1]);
            ) {
                int symbol = reader.read();
                System.setOut(filePrintStream);
                while (symbol != -1) {
                    char ch = (char) symbol;
                    for (int i = 0; i < alphabet.length; i++) {
                        if (ch == alphabet[i]) {
                            ch = alphabetCode[i];
                            System.out.print(ch);
                            break;
                        }
                    }
                    symbol = reader.read();
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }

            return new Result("encode all right", ResultCode.OK);
    }
}
