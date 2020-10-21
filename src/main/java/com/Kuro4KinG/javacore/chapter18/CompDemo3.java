package com.kuro4king.javacore.chapter18;

import java.util.Comparator;
import java.util.TreeSet;

public class CompDemo3 {
    public static void main(String[] args) {
        // использовать лямбда-выражение для реализации
        // компаратора типа Comparator<String>
        Comparator<String> mc = (aStr, bStr) -> aStr.compareTo(bStr);

        TreeSet<String> ts = new TreeSet<>(mc.reversed());
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
