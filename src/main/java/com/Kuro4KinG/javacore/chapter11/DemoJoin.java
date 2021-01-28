package com.Kuro4KinG.javacore.chapter11;

public class DemoJoin {
    public static void main(String[] args) {
        NewThread3 ob1 = new NewThread3("Один");
        NewThread3 ob2 = new NewThread3("Два");
        NewThread3 ob3 = new NewThread3("Три");

        System.out.println("Поток один запущен: " + ob1.t.isAlive());
        System.out.println("Поток два запущен: " + ob2.t.isAlive());
        System.out.println("Поток три запущен: " + ob3.t.isAlive());
        // Ожидать завершения потоков исполнения
        try {
            System.out.println("Ожидание завершения потоков.");
            ob1.t.join();
            ob3.t.join();
            ob2.t.join();
        } catch (InterruptedException e) {
            System.out.println("Главный поток прерван ");
        }
        System.out.println("Поток один запущен: " + ob1.t.isAlive());
        System.out.println("Поток два запущен: " + ob2.t.isAlive());
        System.out.println("Поток три запущен: " + ob3.t.isAlive());
        System.out.println("Главный поток завершен.");
    }

}
