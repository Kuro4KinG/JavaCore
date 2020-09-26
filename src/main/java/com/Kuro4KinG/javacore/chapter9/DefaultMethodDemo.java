package main.java.com.Kuro4KinG.javacore.chapter9;

interface MyIF {
    // Это объявление обычного метода в интерфейсе.
    // Он НЕ предоставляет реализацию по умолчанию
    int getNumber();

    // А это объявление метода по умолчанию. Обратите
    // внимание на его реализацию по умолчанию
    default String getString() {
        return "Объект типа String по умолчанию";
    }

    // Это объявление статического метода в интерфейсе
    static int getDefaultNumber() {
        return 0;
    }
}

// Реализовать интерфейс MyIF
class MyIFImp implements MyIF {
    // В этом классе должен быть реализован только метод getNumber(),
    // определённый в интерфейсе MyIF.
    // А вызов метода getString() разрешается по умолчанию
    public int getNumber() {
        return 100;
    }
}

class MyIFImp2 implements MyIF {
    // В этом классе предоставляются реализация обоих методов
    // getNumber() и getString()
    public int getNumber() {
        return 100;
    }

    public String getString() {
        return "Это другая символьная строка";
    }
}

// Использовать метод по умолчанию
class DefaultMethodDemo {
    public static void main(String[] args) {
        MyIFImp obj = new MyIFImp();
        MyIFImp2 obj2 = new MyIFImp2();
        // Метод getNumber() можно вызвать, т.к. он явно реализован
        // в классе MyIFImp:
        System.out.println(obj.getNumber());

        // Метод getString() также можно вызвать, т.к. в интерфейсе
        // имеется его реализация по умолчанию:
        System.out.println(obj.getString());

        System.out.println(obj2.getNumber());
        System.out.println(obj2.getString());
    }
}
