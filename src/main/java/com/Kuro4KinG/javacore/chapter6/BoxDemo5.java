package main.java.com.Kuro4KinG.javacore.chapter6;

public class BoxDemo5 {
    public static void main(String[] args) {
        Box mybox1 = new Box();
        Box mybox2 = new Box();
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
