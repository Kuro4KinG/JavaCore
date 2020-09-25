package main.java.com.Kuro4KinG.javacore.chapter9;

class TestIFace2 {
    public static void main(String[] args) {
        CallBack c = new Client();
        AnotherClient ob = new AnotherClient();

        c.callback(42);
        c = ob;     // теперь переменная c ссылается на
                    // объект типа AnotherClient
        c.callback(42);

    }
}
