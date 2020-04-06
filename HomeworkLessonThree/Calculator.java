package HomeworkLessonThree;
/**
 * QA Automation. Kevin. Homework 3
 * @author Olena Moskvina
 * @version dated 07/03/2020
 */

public class Calculator {

    public static void main(String[] args) {

        //Калькулятор

        double num1 = 6.8;
        double num2 = 3.4;
        char operation = '/';
        double result = calc(num1, num2, operation);
        System.out.println("Результат операции: " + result);
    }

    public static double calc(double num1, double num2, char operation) {
        double result;
        switch (operation) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            default:
                System.out.println("Операция не распознана");
                result = calc(num1, num2, operation);
        }
        return result;
    }
}
