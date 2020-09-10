package main.java.com.Kuro4KinG.javacore.chapter3;
//  Продемонстрировать применение значений типа boolean
class BoolTest {
    public static void main(String[] args) {
        boolean b;

        b = false;
        System.out.println("b равно " + b);
        b = true;
        System.out.println("b авно " + b);

        // значение типа boolean может управлять оператором f
        if (b) System.out.println("Этот код выполняется.");
        b = false;
        if (b) System.out.println("Этот код не выполняется.");

        // результат сравнения - значения типа boolean
        System.out.println("10 > 9 равно " + (10 > 9) );
    }
}
