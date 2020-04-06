package HomeworkLessonThree;

/**
 * QA Automation. Kevin. Homework 3
 * @author Olena Moskvina
 * @version dated 07/03/2020
 */

public class HomeworkLesson3 {

        public static void main (String[]args) {

            int a;
            int b;
            int c;
            int x;


            a = 1000;
            b = 1000;
            c = 10;
            x = 1000;

//Задание 1
            if (a < b && a < c && a < x) {
                System.out.println("Наименьшее число - a = " + a);
            } else if (b < a && b < c && b < x) {
                System.out.println("Наименьшее число - b = " + b);
            } else if (c < a && c < b && c < x) {
                System.out.println("Наименьшее число - c = " + c);
            } else if (x < a && x < b && x < b) {
                System.out.println("Наименьшее число - x = " + x);

            }

//Задание 2
            if ((a == b && a != c && a != x) || (a == c && a != b && a != x) || (a == x && a != b && a != c) || (c == b && b != a && b != x) || (b == x && b != a && b != c) || (c == x && c != a && c != b)) {
                System.out.println("Количество одинаковых значений 2");
            } else if ((a == b && b == c && a != x) || (a == c && c == x && a != b) || (a == b && b == x && a != c) || (b == c && c == x && b != a)) {
                System.out.println("Количество одинаковых значений 3");
            } else if (a == b && a == c && a == x) {
                System.out.println("Количество одинаковых значений 4");
            } else {
                System.out.println("Одинаковых значений нет");
            }

        }

    }

