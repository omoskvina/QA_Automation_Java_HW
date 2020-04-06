package HomeworkLessonSix;
/**
 * QA Automation. Kevin. Homework 6
 * @author Olena Moskvina
 * @version dated 05/04/2020
 */

public class HomeworkLesson6 {
    public static void main(String[] args) {

        // создание строки
        String plndrmString = new String("Кит на море романтик");


        for (int i = plndrmString.length() - 1; i >= 0; i--) {
            char letter = plndrmString.charAt(i);

            System.out.print(letter);
        }

        System.out.println("");


        // вариант с преобразованием строки в массив
        char[] plndrmArray = plndrmString.toCharArray();
        for (int j = plndrmString.length() - 1; j >= 0; j--) {
            char element = plndrmArray[j];


            System.out.print(element);

        }


    }

}
