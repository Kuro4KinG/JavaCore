package main.java.com.Kuro4KinG.javacore.chapter8;
// Расширение класса BoxWeight2 включением в него поля стоимости доставки

// добавить поле стоимости доставки
class Shipment extends BoxWeight2 {
    double cost;

    // сконструировать клон объекта
    Shipment(Shipment ob) { // передать объект конструктору
        super(ob);
        cost = ob.cost;
    }

    // конструктор, применяемый при указании всех параметров
    Shipment(double w, double h, double d, double m, double c) {
        super(w, h, d, m); // вызвать конструктор супрекласса
        cost = c;
    }

    // конструктор, применяемый по умолчанию
    Shipment() {
        super();
        cost = -1;
    }

    // конструктор, применяемый при создании куба
    Shipment(double len, double m, double c) {
        super(len, m);
        cost = c;
    }
}

class DemoShipment {
    public static void main(String[] args) {
        Shipment shipment1 = new Shipment(10, 20, 15, 10, 3.41);
        Shipment shipment2 = new Shipment(2, 3, 4, 0.76, 1.28);

        double vol;

        vol = shipment1.volume();
        System.out.println("Объём shipment1 равен " + vol);
        System.out.println("Вес shipment1 равен " + shipment1.weight);
        System.out.println("Стоимость доставки: $" + shipment1.cost);
        System.out.println();

        vol = shipment2.volume();
        System.out.println("Объём shipment2 равен " + vol);
        System.out.println("Вес shipment2 равен " + shipment2.weight);
        System.out.println("Стоимость доставки: $" + shipment2.cost);
    }
}
