package com.kuro4king.javacore.chapter18;
// Продемонстрировать применение класса HashSet

import java.util.HashSet;
import java.util.LinkedHashSet;

public class HashSetDemo {
    public static void main(String[] args) {
        // создать хеш-множество
        HashSet <String> hs = new HashSet<>();
        // ввести элементы в хеш-множество
        hs.add("Бета");
        hs.add("Альфа");
        hs.add("Эта");
        hs.add("Гамма");
        hs.add("Эпсилон");
        hs.add("Омега");

        System.out.println(hs);
    }
}
