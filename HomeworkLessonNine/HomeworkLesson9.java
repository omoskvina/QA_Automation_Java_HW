package HomeworkLessonNine;
/**
 * QA Automation. Kevin. Homework 9
 * @author Olena Moskvina
 * @version dated 19/04/2020
 */

public class HomeworkLesson9 {

    public static void main(String[] args) {
        ComputerCase ccase = new ComputerCase("tower", "OFF", "ON","mouse","empty","keyboard", "empty");
        PowerSupply powerSupply = new PowerSupply(500,"ATX");
        DataStorage hardDrive =new DataStorage("HDD", 1, 3.5, "internal", true);
        Processor cpu = new Processor("AMD FX-8300", 8, 3.3);
        Motherboard motherboard = new Motherboard("Asus M5A97 R2.0", "ATX", "DDR3-1600", 8, "UEFI", "USB", "HDD", "GeForce GTX 1050 Ti", 1290, 4);
        ComputerMonitor monitor = new ComputerMonitor ("LED", 24, "IPS", "1920 x 1080" );
        Keyboard keyboard = new Keyboard("connected", "wired");
        Mouse mouse = new Mouse ("wireless", "connected", true);
        Headphones headphones = new Headphones("wireless", "connected", true);
        FlashUSB flashUSB = new FlashUSB (32, true, "disconnected");



        PersonalComputer myComp = new PersonalComputer("myDesktop", "ulitosik", ccase, hardDrive, powerSupply, cpu, motherboard, monitor, keyboard, mouse, headphones, ccase.getPowerButton(), flashUSB);
        String Case1 = "To turn on";
        myComp.start();

        String Case2 = "To find a file";
        String Case3 = "To listen to the music";
        String Case4 = "To play a game";

    }
}
