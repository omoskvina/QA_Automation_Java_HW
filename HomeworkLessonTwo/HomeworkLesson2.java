package HomeworkLessonTwo;

/**
 * QA Automation. Kevin. Homework 2
 * @author Olena Moskvina
 * @version dated 02/03/2020
 */


public class HomeworkLesson2 {
    public static void main(String args[]) {

        byte some_x = -118; // 8-разрядное целое число, min -128 max 127
        short some_a = 32145; // 16-разрядное целое число, min -32768 max 32767
        int some_i = 580000; // 32-разрядное целое число, min  -2147483648 max 2147483647
        long some_long = 123456789987654321L; // 64-разрядное целое число, min -9223372036854775808	max 9223372036854775807;
        float euro = 29.88F; // 32-разрядное число в формате IEEE 754 с плавающей точкой, min  -3.4E+38	max 3.4E+38
        double pi = 3.14159265359; // 64-разрядное число в формате IEEE 754 с плавающей точкой,  min -1.7E+308	 max 1.7E+308
        char ch1 = 'x'; //16-разрядное беззнаковое целое, представляющее собой символ UTF-16 (буквы и цифры), min 0 max 65536
        boolean boo = false; // boolean - булев тип, может иметь значения true или false


        int x = 15;
        int a = 3;
        int y = 48;
        int b = x/a;
        int z = x+ --a;
        int c = x*a;
        int d = x- ++a;
        int g = x%a;
        int h = y%x;

        System.out.println("QUOTIENT of x/a = " + ++b); // (15 : 3) + 1 = 6
        System.out.println("SUM of x+ --a = " + z); // 15 + (3 - 1) = 17
        System.out.println("PRODUCT of x*a = " + --c); // (15 * 2) - 1 = 29
        System.out.println("DIFFERENCE of x-a = " + d); // (15 - 3) = 12
        System.out.println("Euclidean division of x%a = " + g); // 15 % 3 = 0
        System.out.println("Euclidean division of y%x = " + h); // 48 % 15 = 3; 48 - (15 * 3) = 3


        // Тип данных char
        //переменной можно присвоить код символа или непосредственно сам символ, который следует окружить одинарными кавычками

        char kod1 = 79;
        char kod2 = 108;
        char kod3 = 'e';
        char kod4 = 110;
        char kod5 = 97;

        System.out.println("Hi, my name's " + kod1 + kod2 +kod3 + kod4 + kod5);

        //Хотя тип char используется для хранения Unicode-символов, его можно использовать как целочисленный тип, используя сложение или вычитание.

        char char_var = 'y';

        System.out.println("Переменная char_var содержит " + char_var); // y

        char_var++;

        System.out.println("Переменная char_var содержит " + char_var); // следующий за y символ z


    }
}


