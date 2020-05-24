package HomeworkLessonNine;

public class Mouse {

    private String type; // wired, wireless
    private String state; // connected, disconnected
    private boolean buttery;

    public Mouse(String type, String state, boolean buttery) {

        this.type = type;
        this.state= state;
        this.buttery=buttery;
    }

    public void ready (){
        if (this.state == "connected")
            System.out.println("The mouse is ready for use");
        else if (this.state == "disconnected")
            System.out.println("WARNING! The mouse is not found!");
        else
            System.out.println("The mouse is disabled");

    }
}
