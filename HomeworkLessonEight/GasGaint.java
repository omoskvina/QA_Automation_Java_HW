package HomeworkLessonEight;

public class Planet extends SolarSystem{
    private  String name;
    private String atmosphere;
    private String water;
    private String magnetosphere;
    private String composition;
    private int numberOfSatellites;
    private float density;
    private float axialTilt;
    private boolean rings;


    public Planet (String n, String atm, String water, String magnet, String comp, int sat, float dens, float tilt, boolean rings) {

        super("Gas giant", 1898, 14313, 69911, 4.503F);
        this.name =n;
        this.atmosphere = atm;
        this.water = water;
        this.magnetosphere = magnet;
        this.composition = comp;
        this.numberOfSatellites = sat;
        this.density = dens;
        this.axialTilt = tilt;
        this.rings = rings;

    }
    private void spin (int linearSpeed){
        System.out.println(name + " spins around on its axis at a speed of " + linearSpeed + " meters per second");
     }

    @Override
    public void move(int speed) {
        //super.move(254000);
        System.out.println(name + " moves around the Sun at a speed of " + speed + " meters per second");
        spin(12000);
    }

    @Override
    public void radiate(String radiation) {
        super.radiate("a lot of radiation types");
        System.out.println(name + " radiates " + radiation) ;

    }
}
