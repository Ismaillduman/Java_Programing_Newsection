package practiseTasks.day_34.device;

public abstract class Phone extends Device{


    public Phone(String brand, String model, double price, String color, char size, boolean hasBattery, boolean hasPowerButton) {
        super(brand, model, price, color, size, hasBattery, hasPowerButton);
    }

    @Override
    public void turnOn() {
        System.out.println("Turn on "+getBrand()+" "+getModel());
    }

    @Override
    public void turnOff() {
        System.out.println("Turn off "+getBrand()+" "+getModel());
    }
    public void call(long phoneNum){
        System.out.println(phoneNum+" is calling");
    }
    public void text(long phoneNum){
        System.out.println(phoneNum+" is writing");
    }

    @Override
    public String toString() {
        return super.toString();
    }

    /*	Extra Methods (none Abstract):
						call(long phoneNum)
						text(long phoneNum)
						toString()*/

}
