package main.java.com.Kuro4KinG.javacore.chapter6;

// В этой программе применяется метод с параметрами
class Box5 {
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

public class BoxDemo5 {
    public static void main(String[] args) {
        Box5 mybox1 = new Box5();
        Box5 mybox2 = new Box5();
        double vol;

        // инициализировать каждый экземпляр класса Box
        mybox1.setDim(10, 20, 15);
        mybox2.setDim(3, 6, 9);

        // получить объём первого параллелепипеда
        vol = mybox1.volume();
        System.out.println("Объём равен " + vol);

        // получить объём второго параллелепипеда
        vol = mybox2.volume();
        System.out.println("Объём равен " + vol);
    }
}
