package HomeworkLessonFive;

/**
 * QA Automation. Kevin. Homework 5
 * @author Olena Moskvina
 * @version dated 05/04/2020
 */

public class HomeworkLesson5 {

    public static void main(String[] args) {

        // создаем многомерный массив 3 по 3;
       int [][] multiDimensionalarray = new int [3][3];

        // добавляем элементы в массив

        multiDimensionalarray [0][0] = 1;
        multiDimensionalarray [0][1] = 2;
        multiDimensionalarray [0][2] = 3;

        multiDimensionalarray [1][0] = 4;
        multiDimensionalarray [1][1] = 5;
        multiDimensionalarray [1][2] = 6;

        multiDimensionalarray [2][0] = 7;
        multiDimensionalarray [2][1] = 8;
        multiDimensionalarray [2][2] = 9;

        // выводим элементы двумерного массива в консоль

        for (int i=0; i<multiDimensionalarray.length; i++){
            for (int k=0; k<multiDimensionalarray[i].length; k++) {

                System.out.println(multiDimensionalarray[i][k]);

            }

        }
    }

}
