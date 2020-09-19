package main.java.com.Kuro4KinG.javacore.chapter6;

//  Теперь метод volume() возвращае объём параллелепипеда

class Box {
    double width;
    double height;
    double depth;

    // рассчитать и возвратить объём
    double volume() {
        return width*height*depth;
    }
}
