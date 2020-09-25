package main.java.com.Kuro4KinG.javacore.chapter9;

class TestIFace {
    public static void main(String[] args) {
        CallBack c = new Client();
        c.callback(42);
    }
}
