package HomeworkLessonEight;

public class HomeworkLesson8 {

    public static void main(String[] args) {
        SolarSystem solarSystemObject = new SolarSystem("Gas giant", 1898, 14313, 69911, 4.503F);
        Planet planet = new Planet("Jupiter", "H, He", "ice, vapor", "dipole, higher components", "gas, liquid, metallic H, gas He", 79, 1.326F, 3.13F, true);




        solarSystemObject.move(254000);
        planet.move(30000);
        planet.radiate("x-rays");

    }
}
