package main.java.com.Kuro4KinG.javacore.chapter3;
// Скомпилировать эту программу нельзя
class ScopeErr {
    public static void main(String[] args) {
        int bar = 1;
        {                   // создаётся новая область действия
        //    int bar = 2;    // Ошибка во вермя компиляции -
                            // переменная bar уже определена!
        }
    }
}
