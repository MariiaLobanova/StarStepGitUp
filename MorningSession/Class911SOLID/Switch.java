package scr.MorningSession.Class911SOLID;
// Exercise 1:
//You have a Switch class controlling a LightBulb.
// Refactor it so that the switch can control any device (e.g., Fan, Heater) by depending on an abstraction.
interface Device {
    void turnOn();
    void turnOff();
}
class LightBulb implements Device {
    @Override
    public void turnOn() {
        System.out.println("lightBulb is turn om");
    }
    @Override
    public void turnOff() {
        System.out.println("lightBulb is turn off");
    }
}
class Fen implements Device {
    @Override
    public void turnOn() {
        System.out.println("Fen is turn om");
    }
    @Override
    public void turnOff() {
        System.out.println("Fen is turn off");
    }
}
public class Switch {
    private Device device;

    public Switch(Device device) {
        this.device = device;
    }

    public static void main(String[] args) {
        Switch lightBulbSwitch = new Switch(new LightBulb());
        lightBulbSwitch.device.turnOn();
        lightBulbSwitch.device.turnOff();

        Switch fenDevice = new Switch(new Fen());
        fenDevice.device.turnOn();
        fenDevice.device.turnOff();



    }
}

