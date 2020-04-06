package HomeworkLessonSeven;
/**
 * QA Automation. Kevin. Homework 7
 * @author Olena Moskvina
 * @version dated 05/04/2020
 */
public class HomeworkLesson7 {

    public static void main(String[] args) {
        Teacher messiah = new Teacher();
        messiah.setName("Jesus");
        messiah.setSurname("Christ");
        messiah.setAge(33);
        System.out.printf("The Teacher\n Name: %s\n Surname: %s\n Age: %d\n", messiah.getName(), messiah.getSurname(), messiah.getAge());

        Pupil apostol = new Pupil("Judas", "Iscaroit", 27);
        apostol.displayinfo();



    }

}
