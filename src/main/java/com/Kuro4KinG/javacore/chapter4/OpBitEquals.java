package main.java.com.Kuro4KinG.javacore.chapter4;

class OpBitEquals {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 3;

        a |= 4; // 5
        b >>= 1; // 1
        c <<= 1; // 6
        a ^= c; // 3

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
    }
}
