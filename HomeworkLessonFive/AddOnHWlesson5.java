package HomeworkLessonFive;
/**
 * QA Automation. Kevin. Homework 5
 * @author Olena Moskvina
 * @version dated 05/04/2020
 */

public class AddOnHWlesson5 {



        public static void main(String[] args) {

            // создаем многомерный массив 3 по 3;
            String [] Apollo11 = new String [] {"Twelve", "eleven", "ten", "nine", "ignition sequence", "starts", "six", "five", "four", "three", "two", "one", "zero, all engine running", "LIFT-OFF!", "We have a lift-off!", "32 minutes past the hour" };

            // добавляем элементы в массив


            // выодим элементы массива в консоль

            for (int i=0; i<Apollo11.length; i++){



                    System.out.println(Apollo11[i] + "\t");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e){
                    }
                }
                System.out.println();
            }
        }

