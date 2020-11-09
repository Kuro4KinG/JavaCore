package main.java.com.Kuro4KinG.javacore.chapter9.Stack;

// Определить интерфейс для целочисленного стека
interface IntStack {
    void push(int item);    // сохранить элемент в стеке

    int pop();              // извлечь элемент из стека

    // У метода clear() теперь имеется вариант по умолчанию, поэтомй
    // его придётся реализовать в том существующем классе, где уже
    // применяется интерфейс IntStack
    default void clear() {
        System.out.println("Метод clear() не реализован");
    }
}
