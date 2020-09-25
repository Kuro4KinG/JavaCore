package main.java.com.Kuro4KinG.javacore.chapter9;
// Ещё одна реализация интерфейса Callback

class AnotherClient implements CallBack {
    // реализовать интерфейс Callback
    public void callback(int p) {
        System.out.println("Ещё один вариант метода callback()");
        System.out.println("p в квадрате равно " + (p * p));
    }
}
