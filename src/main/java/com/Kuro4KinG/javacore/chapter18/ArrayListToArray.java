package com.kuro4king.javacore.chapter18;

import java.util.ArrayList;

// Преобразовать списочный массив в ArrayList в списочный массив
public class ArrayListToArray {
    public static void main(String[] args) {
        // создать списочный массив
        ArrayList<Integer> al = new ArrayList<>();

        // ввести элементы в списоный массив
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);

        System.out.println("Содержание списосного массива l: " + al);

        // получить обычный массив
        Integer ia[] = new Integer[al.size()];
        ia = al.toArray(ia);

        int sum = 0;

        //  суммировать элемнеты массива
        for (int i : ia) {
            sum += i;
        }

        System.out.println("Сумма: " + sum);

    }
}
