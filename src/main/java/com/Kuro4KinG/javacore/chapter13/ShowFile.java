package com.kuro4king.javacore.chapter13;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ShowFile {
    public static void main(String[] args) {
        int i;

        // сначала убедиться, что имя файла указано
        if (args.length != 1) {
            System.out.println("Использование: ShowFile имя_файла");
            return;
        }

        // Попытка открыть файл
        try (FileInputStream fin = new FileInputStream(args[0])) {
            do {
                i = fin.read();
                if (i != -1) System.out.println((char) i);
            } while (i != -1);
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден.");
        } catch (IOException e) {
            System.out.println("Ошибка ввода-вывода");
        }
    }
}

