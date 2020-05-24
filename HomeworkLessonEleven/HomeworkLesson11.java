package HomeworkLessonEleven;

/**
 * QA Automation. Kevin. Homework 11
 * @author Olena Moskvina
 * @version dated 11/05/2020
 */

public class HomeworkLesson11 {
    public static void main(String[] args) {
        GasGiant jupiter = new GasGiant("Jupiter","Gas giant", 1898, 14313, 69911, 4.503F);
        jupiter.move(254000);
        jupiter.radiate("x-rays, radio waves, etc");
        jupiter.spin(12000);

    }
}
