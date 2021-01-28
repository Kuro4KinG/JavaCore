package com.Kuro4KinG.javacore.chapter11;

// Создать второй поток исполнения, расширив класс Thread
class NewThread2 extends Thread {
    NewThread2() {
        // создать новый поток исполнения
        super("Демонстрационный поток");
        System.out.println("Дочерний поток: " + this);
        start(); // запустить поток на исполнение
    }
    // Точка входа во второй поток исполнения

    @Override
    public void run() {
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("Дочерний поток: " + i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("Дочерний поток прерван");
        }
        System.out.println("Дочерний поток завершен");
    }
}

public class ExtendThread {
    public static void main(String[] args) {
        new NewThread(); // создать новый поток
        new Thread();
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("Главный поток: " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Главный поток прерван.");
        }
        System.out.println("Главный поток завершен.");
    }
}
