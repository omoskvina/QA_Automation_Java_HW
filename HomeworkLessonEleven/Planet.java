package HomeworkLessonEleven;

public abstract class Planet {

    private String type; //
    private int mass; // *10^24, kg
    private int volume; // *10^10, km^3
    private int meanRadius; // km
    private float age;// billion years

    public Planet(String t, int m, int v, int r, float a){
        this.type = t;
        this.mass = m;
        this.volume = v;
        this.meanRadius = r;
        this.age = a;
    }

    public abstract void move (int speed);

    public abstract void radiate (String radiation);

}

