package main.java.com.Kuro4KinG.javacore.chapter6;

/*  Программа, использующая класс Box

    Присвоить исходному файлу имя BoxDemo.java
 */
class Box {
    double width;
    double height;
    double depth;

    // Вывести объём параллелепипеда
    void volume() {
        System.out.print("Объем равен ");
        System.out.println(width * height * depth);
    }
}
