package com.Kuro4KinG.javacore.chapter22;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.*;
import java.util.stream.IntStream;

public class Whois {
    public static void main(String[] args) throws Exception, UnknownHostException {
        int c;

        // создать сокетное соединение с веб-сайтом internic.net
        // через порт 43

        try (Socket s = new Socket("www.internic.net", 43)) {

            // получить потоки ввода-вывода
            InputStream in = s.getInputStream();
            OutputStream out = s.getOutputStream();

            // сформировать строку запроса
            String str = (args.length == 0 ? "OraclePressBooks.com" : args[0] + "\n");

            // преобразовать строку запроса в байты
            byte buf[] = str.getBytes();

            // послать запрос
            out.write(buf);

            // прочитать ответ и вывести его на экран
            while ((c = in.read()) != -1) {
                System.out.println((char) c);
            }

        }catch (SocketException e) {
            System.out.println("Ooops");
        }
    }
}
