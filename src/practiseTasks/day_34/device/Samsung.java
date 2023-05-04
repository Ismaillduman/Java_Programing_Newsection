package practiseTasks.day_34.device;

public class Samsung extends Phone implements AndroidApps,Downloadable{
    public Samsung(String model, double price, String color, char size, boolean hasBattery, boolean hasPowerButton) {
        super(model, price, color, size, hasBattery, hasPowerButton);
    }

    @Override
    public void downloadApp() {

    }
}
