package main.java.com.Kuro4KinG.javacore.chapter6;

// В этом классе объявляется объект типа Box
public class BoxDemo {
    public static void main(String[] args) {
        Box mybox = new Box();
        double vol;
        // присвоить значение переменным экземпляра mybox
        mybox.width = 10;
        mybox.height = 20;
        mybox.depth = 15;

        // рассчитать объем параллелепипеда
        vol = mybox.width * mybox.height * mybox.depth;
        System.out.println("Объём равен " + vol);
    }
}
