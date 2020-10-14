package com.kuro4king.javacore.chapter18;
// Использовать специальный компаратор

import java.util.*;

// Компаратор для сравнения символьных строк
class MyComp2 implements Comparator<String> {
    public int compare(String aStr, String bStr) {
        return aStr.compareTo(bStr);
    }
}

public class CompDemo2 {
    public static void main(String[] args) {
        MyComp2 mc = new MyComp2(); // создать компаратор

        // передать вариант компаратора типа MyComp2 с обратным
        // упорядочением древовидному множеству типа TreeSet
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
