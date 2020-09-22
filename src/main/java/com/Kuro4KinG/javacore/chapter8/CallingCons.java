package main.java.com.Kuro4KinG.javacore.chapter8;
// Продемонстрировать порядок вызова конструкторов

// создать супрекласс

class A4 {
    A4() {
        System.out.println("В конструкторе A4");
    }
}

// создать подкласс путём арсширения класса A4
class B4 extends A4 {
    B4() {
        System.out.println("В конструкторе B4");
    }
}

// создать ещё один подкласс путём расширения класса B4
class C4 extends B4 {
    C4() {
        System.out.println("В конструкторе C4");
    }
}

class CallingCons {
    public static void main(String[] args) {
        C4 c = new C4();
    }
}
