package HomeworkLessonNine;

public class FlashUSB {
    private int capacity; // GB
    private boolean osUSB;
    private String state; // connected, disconnected

    public FlashUSB(int capacity, boolean osUSB, String state) {
        this.capacity = capacity;
        this.osUSB = osUSB;
        this.state = state;
    }

    public int getCapacity() {
        return capacity;
    }

    public boolean isOsUSB() {
        return osUSB;
    }

    public String getState() {
        return state;
    }

    public void ready () {
        if (this.state == "connected")
            System.out.println("The USB flash drive is ready for use");
        else if (this.state == "disconnected")
            System.out.println("WARNING! The USB flash drive is not found!");
        else
            System.out.println("The USB flash drive is disabled");
    }
}
