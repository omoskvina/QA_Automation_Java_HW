package HomeworkLessonEight;

public class HomeworkLesson8 {

    public static void main(String[] args) {
        Planet planet = new Planet("Gas giant", 1898, 14313, 69911, 4.503F);
        GasGaint gasGiant = new GasGaint("Jupiter", "H, He", "ice, vapor", "dipole, higher components", "gas, liquid, metallic H, gas He", 79, 1.326F, 3.13F, true);




        planet.move(254000);
        gasGiant.move(30000);
        gasGiant.radiate("x-rays, radio waves, etc");

    }
}
