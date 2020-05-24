package HomeworkLessonNine;

public class DataStorage {
    private String type; //SSD, HDD
    private int capacity; // TB
    private double formFactor; // inches
    private String location; // internal, external
    private boolean os; //

    public DataStorage(String type, int capacity, double formFactor, String location, boolean os) {
        this.type = type;
        this.capacity = capacity;
        this.formFactor = formFactor;
        this.location = location;
        this.os = os;

    }

    public int getCapacity() {
        return capacity;
    }

    public boolean isOs() {
        return os;
    }

    public void run (){

    }
}
