package main.java.com.Kuro4KinG.javacore.chapter6;

/* В данном примере программы для инициализации размеров
 параллелепипеда в классе Box применяется коструктор
 */
class Box6 {
    double width;
    double heigth;
    double depth;

    //Это конструктор класса Box
    Box6() {
        System.out.println("Конструирование объекта Box");
        width = 10;
        heigth = 10;
        depth = 10;
    }

    // рассчитать и возвратить объём
    double volume() {
        return width * heigth * depth;
    }
}

public class BoxDemo6 {
    public static void main(String[] args) {
        // объявить, выделить память и инициализровать объекты типа Box
        Box6 mybox1 = new Box6();
        Box6 mybox2 = new Box6();

        double vol;

        // получить объём первого параллелепипеда
        vol = mybox1.volume();
        System.out.println("Объём равен " + vol);

        // получить объём второго параллелепипеда
        vol = mybox2.volume();
        System.out.println("Объём равен " + vol);
    }
}
