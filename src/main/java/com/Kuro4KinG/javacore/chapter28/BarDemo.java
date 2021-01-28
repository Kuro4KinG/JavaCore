package com.Kuro4KinG.javacore.chapter28;
// Продемонстрировать применение класса CyclicBarrier

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class BarDemo {
    public static void main(String[] args) {
        CyclicBarrier cb = new CyclicBarrier(3, new BarAction());

        new Thread(new MyThread2(cb, "A")).start();
        new Thread(new MyThread2(cb, "B")).start();
        new Thread(new MyThread2(cb, "C")).start();
        new Thread(new MyThread2(cb, "X")).start();
        new Thread(new MyThread2(cb, "Y")).start();
        new Thread(new MyThread2(cb, "Z")).start();

    }
}

// Поток исполнения, использующий барьер типа CyclicBarrier

class MyThread2 implements Runnable {
    CyclicBarrier cbar;
    String name;

    MyThread2(CyclicBarrier c, String n) {
        cbar = c;
        name = n;
    }

    @Override
    public void run() {
        System.out.println(name);

        try {
            cbar.await();
        } catch (BrokenBarrierException exc) {
            System.out.println(exc);
        } catch (InterruptedException exc) {
            System.out.println(exc);
        }
    }
}

// Объект этого класса вызывается по достижении барьера типа CyclicBarrier
class BarAction implements Runnable {
    @Override
    public void run() {
        System.out.println("Барьер достигнут!");
    }
}