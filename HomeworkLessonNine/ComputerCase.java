package HomeworkLessonNine;

import javax.swing.*;

public class ComputerCase {

private String type; // tower, desktop, pizza box
private String resetButton; // ON, OFF
private String powerButton; // ON, OFF
private String usbPort1;// empty, mouse, keyboard, flashUSB
private String audioPort; // empty, headphones, speakers
private String usbPort2; // empty, mouse, keyboard, flashUSB
private String usbPort3; // empty, mouse, keyboard, flashUSB


    public ComputerCase(String type, String resetButton, String powerButton, String usbPort1, String audioPort, String usbPort2, String usbPort3) {
        this.type = type;
        this.resetButton = resetButton;
        this.powerButton = powerButton;
        this.usbPort1 = usbPort1;
        this.audioPort = audioPort;
        this.usbPort2 = usbPort2;
        this.usbPort3 = usbPort3;
    }

    public String getPowerButton() {
        return powerButton;
    }

    public void power (String powerButton) {
        if (this.powerButton == "ON")
            System.out.println("The power's ON");
        else System.out.println("Push the POWER button");
    }
}

