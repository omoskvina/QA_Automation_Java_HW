package HomeworkLessonNine;

public class Headphones {

    private String type; // wired, wireless
    private String mode; // connected, disconnected;
    private boolean buttery;

    public Headphones(String type, String mode, boolean buttery) {
        this.type = type;
        this.mode = mode;
        this.buttery = buttery;

    }

    public void sound (){
        System.out.println("La-la-la");
    }
}
