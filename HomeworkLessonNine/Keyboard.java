package HomeworkLessonNine;


public class Keyboard {

    private String type; // wired, wireless
    private String state; // connected, disconnected

    public Keyboard(String state, String type) {

        this.type = type;
        this.state = state;
    }

    public void ready () {
        if (this.state == "connected")
            System.out.println("The keyboard is ready for use");
        else if (this.state == "disconnected")
            System.out.println("WARNING! The keyboard is not found!");
        else
            System.out.println("The keyboard is disabled");

    }
}

