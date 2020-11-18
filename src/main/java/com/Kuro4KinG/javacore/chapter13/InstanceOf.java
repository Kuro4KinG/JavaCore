package com.kuro4king.javacore.chapter13;

// Продемонстрировать применение оператора instanceof
class A {
    int i, j;
}

class B {
    int i, j;
}

class C extends A {
    int k;
}

class D extends A {
    int k;
}

public class InstanceOf {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();
        D d = new D();
        if (a instanceof A)
            System.out.println("a является экземпляром A");
        if (b instanceof B)
            System.out.println("b является экземпляром B");
        if (c instanceof C)
            System.out.println("c является экземпляром C");
        if (c instanceof A)
            System.out.println("c можно привести к типу A");
        if (a instanceof C)
            System.out.println("a можно привести к типу C");
        else System.out.println("a нельзя привести к типу C");


    }
}
