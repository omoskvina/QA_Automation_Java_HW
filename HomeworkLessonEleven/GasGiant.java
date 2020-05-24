package HomeworkLessonEleven;

public class GasGiant extends Planet implements IPlanet {

    String name ;

    public GasGiant(String name, String t, int m, int v, int r, float a) {
        super(t, m, v, r, a);
        this.name = name;
    }

    public void move (int speed) {
        System.out.println(name + " moves around the Sun at a speed of " + speed + " meters per second");
    };

    public void radiate (String radiation){
        System.out.println(name  + " radiates " + radiation) ;

    };

    public void spin (int linearSpeed){
        System.out.println(name + " spins around on its axis at a speed of " + linearSpeed + " meters per second");
    };

}
