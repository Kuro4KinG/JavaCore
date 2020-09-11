package main.java.com.Kuro4KinG.javacore.chapter3;
// В этом примере демонстрируется динамическая инициализация
class DynInit {
    public static void main(String[] args) {
        double a = 3.0, b = 4.0;

        // динамическая инициализация переменной c
        double c = Math.sqrt(a * a + b * b);
        System.out.println("Гипотенуза равна " + c);
    }
}