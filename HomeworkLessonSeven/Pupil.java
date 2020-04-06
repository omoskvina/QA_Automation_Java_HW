package HomeworkLessonSeven;

public class Pupil {
    String name;
    String surname;
    int age;

    Pupil(String n, String s, int a) {
        this.name = n;
        this.surname = s;
        this.age = a;
    }

    void displayinfo() {
        System.out.printf("The Disciple\n Name: %s\n Surname: %s\n Age: %d\n", name, surname, age);
    }
}