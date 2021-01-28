package com.Kuro4KinG.javacore.chapter22;

import java.net.*;
import java.util.*;

public class HttpUrlDemo {
    public static void main(String[] args) throws Exception {
        URL hp = new URL("https://yandex.ru");
        HttpURLConnection hpCon = (HttpURLConnection) hp.openConnection();

        // вывести метод запроса
        System.out.println("Метод запроса: " + hpCon.getRequestMethod());

        // вывести код ответа
        System.out.println("Код ответа: " + hpCon.getResponseCode());

        // вывести ответное сообщение
        System.out.println("Ответное сообщение: " + hpCon.getResponseMessage());

        // получить список полей и множество ключей из заголовка
        Map<String, List<String>> hdrMap = hpCon.getHeaderFields();
        Set<String> hdrField = hdrMap.keySet();
        System.out.println("\nДалее следует заголовок:");

        // вывести все ключи и значения из заголовка
        for (String k : hdrField) {
            System.out.println("Ключ: " + k + " Значение: " + hdrMap.get(k));
        }
    }
}
