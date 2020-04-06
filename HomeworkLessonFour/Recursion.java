package HomeworkLessonFour;

/**
 * QA Automation. Kevin. Homework 4
 * @author Olena Moskvina
 * @version dated 16/03/2020
 */

public class Recursion {


    public static int recursion (int n ) {    // создаем метод

        if (n == 1) {
            return 1; // задаем базис рекурсии
        }
        return recursion(n - 1) * n; // задаем шаг рекурсии
    }
}
