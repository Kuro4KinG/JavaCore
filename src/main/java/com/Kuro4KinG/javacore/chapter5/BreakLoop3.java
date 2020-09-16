package main.java.com.Kuro4KinG.javacore.chapter5;

// Применение оператора break во вложенных циклах
class BreakLoop3 {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            System.out.print("Проход " + i + ": ");
            for (int j = 0; j < 100; j++) {
                if (j == 10) break;  // выход из цикла, значение
                                      // переменной  равно 10
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println("Циклы завершены.");
    }
}
