package main.java.com.Kuro4KinG.javacore.chapter6;

// Теперь метод volume() возвращает объём параллелепипеда

class Box4 {
    double width;
    double height;
    double depth;

    // рассчитать и возвратить объём
    double volume() {
        return width * height * depth;
    }
}

public class BoxDemo4 {
    public static void main(String[] args) {
        Box4 mybox1 = new Box4();
        Box4 mybox2 = new Box4();
        double vol;

        // присвоить значения переменным экземпляра mybox1
        mybox1.width = 10;
        mybox1.height = 20;
        mybox1.depth = 15;

        /* присвоить другие значения переменным экземпляра mybox2 */
        mybox2.width = 3;
        mybox2.height = 6;
        mybox2.depth = 9;

        //получить объём первого параллелепипеда
        System.out.println("Объём равен " + mybox1.volume());

        //получить объём второго параллелепипеда
        System.out.println("Объём равен " + mybox2.volume());
    }
}
