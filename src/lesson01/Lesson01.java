package lesson01;

// однострочный комментарий

/* многострочный
 комментарий */

import java.sql.SQLOutput;

// psvm + Enter
// метод main - очка входа в программу
public class Lesson01 {
    public static void main(String[] args) {
        System.out.println("Hello World"); // вывод информации в консоль

        // переменные
        // объявление переменных: тип_данных имяПеременной (CamelCase)
        // тип данных

        int size; // объявили переменную типа int с именем size
        size = 1000;

        int count = 750;
        count = 620;
        System.out.println(count);

        // byte short int long

        byte size1 = 100;
        System.out.println(size1);

        long size2 = 125646646546466L;
        System.out.println(size2);

        int lenght = 300, width = 450; // объявление переменных одного типа в одну инструкцию
        lenght = 900_100; // при записи чисел можно использовать _ для удобства чтения
        System.out.println(lenght); // 900100 - подчеркивания нет

        long bigData = 8001;
        long bigData2 = 800_000_000_000L;

        // дробные числа

        double temp01 = 12.9;
        float temp02 = 12.9F; // виртуальные машины оптимизированы под double

        // для точных вычислений необходимо использовать ссылочные типы или доп. библиотеки

        // System.out.println(bigData / 0); - целочисленное деление на ноль останавливает программу
        System.out.println(temp01 / 0); // Infinity, ошибкой не является

        boolean isActive = true;
        boolean isClose = false;

        //приведение типов
        // явное
        // автоматическое

        // 1. автоматическое
        int height01 = 1900;
        long height02 = height01; // автоматическое приведениие типов
        // автоматическое приведение возможно только при совместимости типов и
        // расширении контейнера, т.е int -> long

        // 2. явное
        int smallValue01 = 10;
        byte smallValue02 = (byte) smallValue01;
        // за явное приведение типов отвечает разработчик

        // бинарный - работает с 2-мя операндами
        // унарный - работает с 1-м операндом

        int a = 10, b = 13;
        int c = a/ b; // результат деления целых чисел - всегда целое число
        System.out.println(c); // 0

        double c02 = (double) (a/b); // 0.0 // сначала производится деление целых чисел, потом приводится к double
        double c03 = (double) a/b; // сначала а приводится к double, потом делится на целое b

        int x = 90;
        long y = 10000;
        long c04 = x * y;

        
        // при сложении byte или short всегда получаем int


    }

}
