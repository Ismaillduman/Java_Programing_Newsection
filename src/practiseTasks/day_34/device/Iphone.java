package practiseTasks.day_34.device;

public class Iphone extends Phone implements AppleApps,Downloadable{
    public Iphone(String model, double price, String color, char size, boolean hasBattery, boolean hasPowerButton) {
        super(model, price, color, size, hasBattery, hasPowerButton);
    }

    @Override
    public void downloadApp() {

    }
}
