package HomeworkLessonNine;

public class ComputerMonitor {

    private String type;
    private int size;
    private String matrixTech;
    private String resolution;

    public ComputerMonitor(String type, int size, String matrixTech, String resolution) {

        this.type = type;
        this.size = size;
        this.matrixTech = matrixTech;
        this.resolution = resolution;
    }

    public void greetingWindow(String user){
        System.out.println("Welcome, " + user + "!");

    }
}
