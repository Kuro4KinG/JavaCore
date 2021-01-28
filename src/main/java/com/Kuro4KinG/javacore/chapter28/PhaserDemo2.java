package com.Kuro4KinG.javacore.chapter28;

// расширить класс Phaser и переопределить
// метод onAdvance() таким образом, чтобы было
// выполнено только определенное количество фаз

import java.util.concurrent.*;

class MyPhaser extends Phaser {
    int numPhases;

    MyPhaser(int parties, int phaseCount) {
        super(parties);
        numPhases = phaseCount - 1;
    }

    // переопределить метод onAdvance(), чтобы
    // выполнить определнное количество фаз

    @Override
    protected boolean onAdvance(int p, int regParties) {
        System.out.println("Фаза " + p + " завершена.\n");

        // возвратить логическое значения true,
        // если все фазы завершены
        if (p == numPhases || regParties == 0) return true;
        return false;
    }
}

public class PhaserDemo2 {
    public static void main(String[] args) {
        MyPhaser phsr = new MyPhaser(1, 4);

        System.out.println("Запуск потоков\n");

        new Thread(new MyThread4(phsr, "A")).start();
        new Thread(new MyThread4(phsr, "B")).start();
        new Thread(new MyThread4(phsr, "C")).start();

        // ожидать завершения определенного количества фаз
        while (!phsr.isTerminated()) {
            phsr.arriveAndAwaitAdvance();
        }

        System.out.println("Синхранизатор фаз завершен");
    }
}

// Поток исполнения, применяющий синхронизатор фаз типа Phaser
class MyThread4 implements Runnable {
    Phaser phsr;
    String name;

    MyThread4(Phaser p, String n) {
        phsr = p;
        name = n;
        phsr.register();
    }

    @Override
    public void run() {
        while (!phsr.isTerminated()) {
            System.out.println("Поток " + name + " начинает фазу " +phsr.getPhase());
            phsr.arriveAndAwaitAdvance();
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}
