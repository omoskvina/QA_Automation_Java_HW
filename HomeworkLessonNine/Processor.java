package HomeworkLessonNine;

public class Processor {
    private String model; //
    private int coreNum; //
    private double clockSignal; // GHz


    public Processor(String model, int coreNum, double clockSignal) {
        this.model = model;
        this.coreNum = coreNum;
        this.clockSignal = clockSignal;

    }

    public void run(){
        System.out.println("CPU is running");

    }
}


