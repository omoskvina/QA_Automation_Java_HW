package HomeworkLessonFour;

/**
 * QA Automation. Kevin. Homework 4
 * @author Olena Moskvina
 * @version dated 16/03/2020
 */

public class HomeworkLesson4 {

        public static void main (String []args) {
            // рекурсия на примере вычисления... конечно же факториала числа))

            int n =15;
            int F = Recursion.recursion(n); // метод recursion в классе HomeworkLessonFour.Recursion, static
            System.out.println("Факториал " + n  + "! =" + F); // выводим на консоль результат метода

            // перегруженные методы

            int a;
            int b;
            int c;
            int d;

            Overload overloadObj = new Overload(); // создаем объект класса с нашими методами

            // умножение

            int M3 = Overload.doMultiplication (90, 3,2);
            System.out.println("Result of multiplication of 3 args = " + M3); // метод статический, обращаемся через класс


            int M2 = overloadObj.doMultiplication(6,2);
            System.out.println("Result of multiplication of 2 args = " + M2); // метод не статический, обращаемся через объект класса


            int M4 = overloadObj.doMultiplication(90,3,5,2);
            System.out.println("Result of multiplication of 4 args = " + M4); // метод не статический, обращаемся через объект класса


            // сложение

            int A4 = Overload.doAddition(90, 3,5, 2);
            System.out.println("Result of addition of 4 args = " + A4);

            int A3 = overloadObj.doAddition (90, 3,2);
            System.out.println("Result of addition of 3 args = " + A3);

            int A2 = overloadObj.doAddition (6,2);
            System.out.println("Result of addition of 2 args = " + A2);


            // вычитание

            int S4 = Overload.doSubtraction(90, 3,5, 2);
            System.out.println("Result of subtraction of 4 args = " + S4);

            int S2 = overloadObj.doSubtraction (6,2);
            System.out.println("Result of subtraction of 2 args = " + S2);

            int S3 = overloadObj.doSubtraction (90, 3, 2);
            System.out.println("Result of subtraction of 3 args = " + S3);


            // деление

            double D3 = Overload.doDivision(75, 3,2);
            System.out.println("Result of division of 3 args = " + D3);

            double D2 = overloadObj.doDivision (13,2);
            System.out.println("Result of division of 2 args = " + D2);

            double D4 = overloadObj.doDivision (90, 6,5,2);
            System.out.println("Result of division of 4 args = " + D4);

        }

    }






