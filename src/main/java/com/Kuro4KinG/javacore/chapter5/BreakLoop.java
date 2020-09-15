package main.java.com.Kuro4KinG.javacore.chapter5;

// Применение оператора break для выхода из цикла
class BreakLoop {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            if (i == 10) break; // выход из цикла, если значение
                                // переменной i равно 10
            System.out.println("i: " + i);
        }
        System.out.println("Цикл завершен");
    }
}