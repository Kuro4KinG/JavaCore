package main.java.com.Kuro4KinG.javacore.chapter6;

// В этой программе применяется метод, введенный в класс Box
public class BoxDemo3 {
    public static void main(String[] args) {
        Box mybox1 = new Box();
        Box mybox2 = new Box();

        // присвоить значение переменным экземпляра mybox1
        mybox1.width = 10;
        mybox1.height = 20;
        mybox1.depth = 15;

        /* присовить другие значения переменным экземпляра mybox2
        экземпляра mybox2 */
        mybox2.width = 3;
        mybox2.height = 6;
        mybox2.depth = 9;

        // вывести объём первого параллелепипеда
        mybox1.volume();

        //вывести объём второго параллелепипеда
        mybox2.volume();
    }
}
