package HomeworkLessonNine;


public class Motherboard {


    private String model; //
    private String formFactor; //
    private String ramInterface; // DDR
    private int ram; // GB
    private String boot; //BIOS, UEFI
    private String firstBootDevice; // HDD, USB, CD/DVD
    private String secondBootDevice; // HDD, USB, CD/DVD
    private String videoCardModel; //
    private int gpu;// MHz
    private int videoCardMemory;// GB


    public Motherboard(String model, String formFactor, String ramInterface, int ram, String boot, String
            firstBootDevice, String secondBootDevice, String videoCardModel, int gpu, int videoCardMemory) {
        this.model = model;
        this.formFactor = formFactor;
        this.ramInterface = ramInterface;
        this.ram = ram;
        this.boot = boot;
        this.firstBootDevice = firstBootDevice;
        this.secondBootDevice = secondBootDevice;
        this.videoCardModel = videoCardModel;
        this.gpu = gpu;
        this.videoCardMemory = videoCardMemory;

    }

    public String getFirstBootDevice() {
        return firstBootDevice;
    }

    public String getSecondBootDevice() {
        return secondBootDevice;
    }




        public void run () {

            System.out.println("POST successfull");
        }


    }

