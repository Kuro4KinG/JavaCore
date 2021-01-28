package com.Kuro4KinG.javacore.chapter22;

import java.util.*;
import java.util.stream.*;

public class StreamDemo10 {
    public static void main(String[] args) {
        // создать символьные строки
        ArrayList<String> myList = new ArrayList<>();
        myList.add("Альфа");
        myList.add("Бета");
        myList.add("Гамма");
        myList.add("Дельта");
        myList.add("Кси");
        myList.add("Омега");

        Stream<String> myStream = myList.stream();

        Spliterator<String> split = myStream.spliterator();

        Spliterator<String> split2 = split.trySplit();
        Spliterator<String> split3 = split2.trySplit();
        if (split2 != null) {
            System.out.println("Результат split2:");
            split2.forEachRemaining(System.out::println);
        }

        System.out.println("Результат split:");
        split.forEachRemaining(System.out::println);
        System.out.println("Результат split3:");
        split3.forEachRemaining(System.out::println);


        Spliterator<String> split4 = split3.trySplit();
        System.out.println("Результат split4:");
        if (split4!=null) {
            split4.forEachRemaining(System.out::println);
        }else System.out.println("split4 = null");
    }
}
