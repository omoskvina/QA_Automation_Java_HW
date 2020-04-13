package HomeworkLessonEight;

public class SolarSystem {

    private String type; //
    private int mass; // *10^24, kg
    private int volume; // *10^10, km^3
    private int meanRadius; // km
    private float age;// billion years

    public SolarSystem(String t, int m, int v, int r, float a){
        this.type = t;
        this.mass = m;
        this.volume = v;
        this.meanRadius = r;
        this.age = a;
    }



    public void move (int speed){
        System.out.println("Every Solar System's object moves at a speed of " + speed + " meters per second");
    }

    public void radiate (String radiation){

        System.out.println("The Solar System object can radiate " + radiation);
    }

}
