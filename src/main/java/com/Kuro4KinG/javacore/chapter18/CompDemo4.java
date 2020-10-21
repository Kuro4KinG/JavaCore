package com.kuro4king.javacore.chapter18;
// Использовать лямбда-выражение для создания компаратора
// с обратным упорядочением

import java.util.*;

public class CompDemo4 {
    public static void main(String[] args) {
        // передать компаратор с обратным упорядочением
        // древовидному множеству типа TreeSet

        TreeSet<String> ts = new TreeSet<>((aStr, bStr) -> bStr.compareTo(aStr));

        // ввести элементы в древовидное множество
        ts.add("C");
        ts.add("A");
        ts.add("B");
        ts.add("E");
        ts.add("F");
        ts.add("D");

        // вывести элементы из древовидного множества
        for (String element : ts)
            System.out.print(element + " ");

        System.out.println();
    }
}
