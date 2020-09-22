package main.java.com.Kuro4KinG.javacore.chapter8;

// Использовать ключевое слово super с целью предотвратить сокрытие имён
class A3 {
    int i;
}

// создать подкласс путём расширения класса A3
class B3 extends A3 {
    int i; // этот член i скрывает член i из класса A3

    B3(int a, int b) {
        super.i = a;      // член i из класса A3
        i = b;            // член i из класса B3
    }

    void show() {
        System.out.println("Член i в суперклассе: " + super.i);
        System.out.println("Член i в суперклассе: " + i);
    }
}

class UseSuper {
    public static void main(String[] args) {
        B3 SubOb = new B3(1, 2);

        SubOb.show();
    }
}
