package practiseTasks.day_34.device;

public class Google extends Phone implements Downloadable,AndroidApps {
    public Google(String model, double price, String color, char size, boolean hasBattery, boolean hasPowerButton) {
        super(model, price, color, size, hasBattery, hasPowerButton);
    }

    @Override
    public void downloadApp() {

    }
    /*extends Phone class and implements Downloadable & AppleApps interfaces*/

}
