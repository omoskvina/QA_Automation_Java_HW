package HomeworkLessonNine;

public class PersonalComputer {

    private String name;
    private String user;
    private Motherboard motherboard;
    private Processor cpu;
    private PowerSupply powerSupply;
    private DataStorage hardDrive;
    private ComputerMonitor monitor;
    private Mouse mouse;
    private Keyboard keyboard;
    private Headphones headphones;
    private ComputerCase ccase;
    private String powerState;
    private FlashUSB flashUSB;

    public PersonalComputer(String name, String user, ComputerCase ccase, DataStorage hardDrive, PowerSupply powerSupply,  Processor cpu, Motherboard motherboard, ComputerMonitor monitor, Keyboard keyboard, Mouse mouse, Headphones headphones, String powerState, FlashUSB flashUSB) {
        this.name = name;
        this.user = user;
        this.motherboard = motherboard;
        this.cpu = cpu;
        this.powerSupply = powerSupply;
        this.hardDrive = hardDrive;
        this.monitor = monitor;
        this.mouse = mouse;
        this.keyboard = keyboard;
        this.headphones = headphones;
        this.ccase = ccase;
        this.powerState = ccase.getPowerButton();
        this.flashUSB = flashUSB;
    }

    public FlashUSB getFlashUSB() {
        return this.flashUSB;
    }

    public DataStorage getHardDrive() {
        return this.hardDrive;
    }

    public Motherboard getMotherboard () {
        return this.motherboard;
    }


    public void start () {

            ccase.power(powerState);
            powerSupply.powerGood();
            motherboard.run();
            cpu.run();
            this.bootDevice();
            monitor.greetingWindow(user);
            keyboard.ready();
            mouse.ready();
            flashUSB.ready();


    }

    public void bootDevice() {

       if (getMotherboard().getFirstBootDevice() == "USB" && getFlashUSB().getState() == "connected" && getFlashUSB().isOsUSB() == true)
            System.out.println("The operating system is loaded from USB drive");
        else if ((getMotherboard().getFirstBootDevice()  == "USB") && (getFlashUSB().getState() == "connected") && (getFlashUSB().isOsUSB() == false))
            System.out.println("Non-System disk or disk error. Replace and press any key when ready");
        else if ((getMotherboard().getFirstBootDevice() == "USB") && (getFlashUSB().getState() == "disconnected")) {


           if ((getMotherboard().getSecondBootDevice() == "HDD") && (getHardDrive().getCapacity() > 0) && (getHardDrive().isOs() == true))
               System.out.println("The operating system is loaded from hard drive");
           else if ((getMotherboard().getSecondBootDevice() == "HDD") && (getHardDrive().getCapacity() > 0) && (getHardDrive().isOs() == !true))
               System.out.println("Boot Failure и An operating system wasn’t found, Reboot and select proper boot device)");
           else if ((getMotherboard().getSecondBootDevice() == "USB") && (getHardDrive().getCapacity() <= 0))
               System.out.println("WARNING! HARD DISK NOT FOUND! PRESS ANY KEY TO CONTINUE!");
           else if ((getMotherboard().getFirstBootDevice() == "HDD") && (getHardDrive().getCapacity() > 0) && (getHardDrive().isOs() == true))
               System.out.println("The operating system is loaded from hard drive");
        }
            else if (((getMotherboard().getFirstBootDevice()== "HDD") && (getHardDrive().getCapacity() > 0)
                    && (getHardDrive().isOs() == !true))
                    || ((getMotherboard().getFirstBootDevice() == "USB") && (getHardDrive().getCapacity() <= 0))) {

                if (((getMotherboard().getSecondBootDevice() == "USB") && (getFlashUSB().getState() == "connected") && (getFlashUSB().isOsUSB() == true)))
                    System.out.println("The operating system is loaded from USB drive");
                else if ((getMotherboard().getSecondBootDevice() == "USB") && (getFlashUSB().getState() == "connected") && (getFlashUSB().isOsUSB() == !true))
                    System.out.println("Non-System disk or disk error. Replace and press any key when ready");
                else if ((getMotherboard().getSecondBootDevice() == "USB") && (getFlashUSB().getState() == "disconnected"))
                    System.out.println("Boot Failure и An operating system wasn’t found, Reboot and select proper boot device");
            } else System.out.println("Error loading operating system");
        }



    }




