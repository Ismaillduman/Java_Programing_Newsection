package practiseTasks.day_34.device;

public abstract class Computer extends Device{


    public Computer(String brand, String model, double price, String color, char size, boolean hasBattery, boolean hasPowerButton) {
        super(brand, model, price, color, size, hasBattery, hasPowerButton);
    }

    public abstract void turnOn();


    public abstract void turnOff();
}
