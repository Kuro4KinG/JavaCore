package com.kuro4king.javacore.chapter18;
// Продемонстрировать различные операции с вектором

import java.util.*;

public class VectorDemo {
    public static void main(String[] args) {

        // начальный размер вектора - 3, а инкремент - 2
        Vector<Integer> v = new Vector<>(3, 2);
        System.out.println("Начальный размер вектора: " + v.size());
        System.out.println("Начальная емкость вектора: " + v.capacity());

        v.addElement(1);
        v.addElement(2);
        v.addElement(3);
        v.addElement(4);

        System.out.println("Емкость вектора после ввода четырех элементов: " + v.capacity());

        v.addElement(5);
        System.out.println("Текущая емкость ветора: " + v.capacity());

        v.addElement(6);
        v.addElement(7);

        System.out.println("Текущая емкость ветора: " + v.capacity());

        v.addElement(9);
        v.addElement(10);

        System.out.println("Текущая емкость ветора: " + v.capacity());

        v.addElement(11);
        v.addElement(12);

        System.out.println("Первый элемент вектора: " + v.firstElement());
        System.out.println("Последний элемент вектора: " + v.lastElement());
        if (v.contains(3))
            System.out.println("Вектор содержит 3.");

        // перечислить элементы вектора
        Enumeration<Integer> vEnaum = v.elements();

        System.out.println("\nЭлементы вектора:");
        while (vEnaum.hasMoreElements())
            System.out.print(vEnaum.nextElement() + " ");
        System.out.println();

        // Использовать итератор для вывода содержимого вектора
        Iterator<Integer>vItr=v.iterator();

        System.out.println("\nЭлементы вектора:");
        while (vItr.hasNext())
            System.out.print(vItr.next()+" ");
        System.out.println();

        // Использовать усовершенствованный цикл for в стиле for each
        // для вывода элементов вектора
        System.out.println("\nЭлмементы вектора:");
        for (int i:v)
            System.out.print(i+" ");
        System.out.println();
    }
}
