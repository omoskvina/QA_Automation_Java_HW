package HomeworkLessonNine;

public class PowerSupply {


    private int powerRating; // W
    private String formFactor; //

    public PowerSupply(int powerRating, String formFactor) {


        this.powerRating = powerRating;
        this.formFactor = formFactor;
    }


    public void powerGood(){
        System.out.println("Power supply unit - OK");

    }
}
