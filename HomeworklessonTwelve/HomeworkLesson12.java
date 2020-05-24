package HomeworklessonTwelve;



import javax.swing.*;
import java.sql.Array;
import java.sql.SQLOutput;
import java.util.*;

public class HomeworkLesson12 {

    public static void main(String[] args) {


        List<Animal> animals = new ArrayList<>();
        animals.add(new Whale("Blue whale", "giant", 2, 2, true));
        animals.add(new Whale ("Beluga", "big", 2, 2, true));
        animals.add(new Spider("Avicularia versicolor", "little", 8, 8, false));
        animals.add(new Spider("Avicularia versicolor", "little", 8, 8, false));
        animals.add(new Panda("Giant Panda", "big", 4, 2, true));

        for(int i=0; i<animals.size(); i++) {

            if (animals.get(i).tail == false)
                System.out.println("The " + animals.get(i).name + " is a" + animals.get(i).size + " animal with " + animals.get(i).legs + " legs and " + animals.get(i).eyes + " eyes");
            else
                System.out.println("The " + animals.get(i).name + " is a" + animals.get(i).size + " animal with " + animals.get(i).legs + " legs and " + animals.get(i).eyes + " eyes and tail");
        }


        HashSet<Animal> pets = new HashSet<>();
        pets.add(new Spider("Shelob", "giant", 8, 8, false));
        pets.add(new Spider("Aragog", "giant", 8, 8, false));
        pets.add(new Whale ("Mobi-Dick", "giant", 2, 2, true ));
        pets.add(new Panda ("Po Ping", "big", 4, 2, true));
        pets.add(new Panda ("Po Ping", "big", 4, 2, true));
        pets.add(new Panda ("Po Ping", "big", 4, 2, true));

        System.out.println(pets.size());

        Iterator<Animal> iterator = pets.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }





        Map<String, Animal> fairyAnimals = new HashMap<>();
        fairyAnimals.put("Shelob", new Spider("Spider", "giant", 8, 8, false));
        fairyAnimals.put("Aragog", new Spider("Spider", "giant", 8, 8, false));
        fairyAnimals.put("Mobi-Dick", new Whale("whale", "giant", 2, 2, true));
        fairyAnimals.put ("Willy", new Whale ("whale", "big", 2, 2, true));
        fairyAnimals.put ("Po Ping", new Panda("Panda", "big", 4, 2, true));


        for (String key : fairyAnimals.keySet()) {
            System.out.println("Key: " + key);

        }

        for (Map.Entry entry : fairyAnimals.entrySet()) {
            System.out.println("Key: " + entry.getKey() + " Value: "
                    + entry.getValue());
        }

        System.out.println(fairyAnimals.containsKey("Shelob"));
        System.out.println(fairyAnimals.containsValue(new Panda("Panda", "big", 4, 2, true)));


    }


}
