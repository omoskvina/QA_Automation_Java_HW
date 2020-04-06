package HomeworkLessonFour;

/**
 * QA Automation. Kevin. Homework 4
 * @author Olena Moskvina
 * @version dated 04/04/2020
 */

public class Overload {

    public  int doMultiplication (int a, int b) {
        int result = a * b;
        return result;
    }
    public  int doMultiplication (int a, int b, int c, int d) {
        int result = a * b * c * d;
        return result;
    }
    public static int doMultiplication (int a, int b, int c) {
        int result = a * b *c;
        return result;
    }

    public  int doAddition(int a, int b) {
        int result = a + b;
        return result;
    }
    public int doAddition(int a, int b, int c) {
        int result = a + b + c;
        return result;
    }

    public static int doAddition(int a, int b, int c, int d) {
        int result = a + b + c + d;
        return result;
    }


    public int doSubtraction(int a, int b) {
        int result = a - b;
        return result;
    }

    public int doSubtraction(int a, int b, int c) {
        int result = a - b - c;
        return result;
    }
    public static int doSubtraction(int a, int b, int c, int d) {
        int result = a - b -c - d;
        return result;
    }
    public double doDivision (double a, double b) {
        double result = a / b;
        return result;
    }
    public static double doDivision (double a, double b, double c) {
        double result = a / b / c ;
        return result;
    }
    public double doDivision (double a, double b, double c, double d) {
        double result = a / b / c / d  ;
        return result;
    }

}
