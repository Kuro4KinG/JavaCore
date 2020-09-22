package main.java.com.Kuro4KinG.javacore.chapter8;

// Простой пример абстракции
abstract class A8 {
    abstract void callme();

    // абстрактные классы всё же могут содержать конкретные методы
    void callmeto() {
        System.out.println("Это конкретный метод.");
    }
}

class B8 extends A8 {
    void callme() {
        System.out.println("Реализация метода callme() из класса B8.");
    }
}

class AbstractDemo {
    public static void main(String[] args) {
        B8 b = new B8();

        b.callme();
        b.callmeto();
    }
}
