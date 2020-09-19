package main.java.com.Kuro4KinG.javacore.chapter6;

//  В этой программе применяется метод с параметрами

class Box {
    double width;
    double height;
    double depth;

    // рассчитать и возвратить объём
    double volume() {
        return width * height * depth;
    }

    // установить размеры параллелепипеда
    void setDim(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }
}
