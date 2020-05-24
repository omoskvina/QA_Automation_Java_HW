package HomeworkLessonThirteen;


import java.util.ArrayList;
import java.util.List;

public class HomeworkLesson13 {

    public static void main(String[] args) {


        List<String> animals = new ArrayList<>();
        animals.add("Blue whale");
        animals.add("Beluga");
        animals.add("Quokka");
        animals.add("Giant Panda");
        try {
          for (int i = 0; i <= animals.size(); i++)

            System.out.println(animals.get(i));
        }
        catch (IndexOutOfBoundsException ex) {
             System.out.println("Выход за пределы списка");
        }
    }


}


