package com.kuro4king.javacore.chapter13;
// Воспользоваться статическим импортом
// для доступа к встроенным в Java методам sqrt() и pow()

import java.lang.Math;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

// вычислить гипотенузу прямоугольного триугольника
public class Hypot {
    public static void main(String[] args) {
        double side1, side2;
        double hypot;

        side1 = 3.0;
        side2 = 4.0;

        // Здесь методы sqrt() и pow() можно вызвать непосредственно,
        // опуская имя класса
        hypot = sqrt(pow(side1, 2) + pow(side2, 2));

        System.out.println("При заданной длине сторон "
                + side1 + " и " + side2 + " гипотенуза равна " + hypot);
    }
}
