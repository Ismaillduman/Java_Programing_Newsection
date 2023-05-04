package practiseTasks.day_34.device;

public abstract class Device {
    private final String brand;
   private final String  model;
   private double price;
   private String color;
   private final char size;
   private boolean hasBattery, hasPowerButton;

    public Device( String model, double price, String color, char size, boolean hasBattery, boolean hasPowerButton) {
        this.brand = getClass().getSimpleName();
        if(model==null||model.isEmpty()||model.isBlank()){
            System.err.println("Invalid model, model can not be null , empty or blank");
            System.exit(1);
        }
        this.model = model;
        this.price = price;
        this.color = color;
        this.size = size;
        this.hasBattery = hasBattery;
        this.hasPowerButton = hasPowerButton;
    }

    public void setPrice(double price) {
        if(price<=0){
            System.err.println("Invalid price "+price+" price can not be negative or zero");
            System.exit(1);
        }
        this.price = price;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setHasBattery(boolean hasBattery) {
        this.hasBattery = hasBattery;
    }

    public void setHasPowerButton(boolean hasPowerButton) {
        this.hasPowerButton = hasPowerButton;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getPrice() {
        return price;
    }

    public String getColor() {
        return color;
    }

    public char getSize() {
        return size;
    }

    public boolean isHasBattery() {
        return hasBattery;
    }

    public boolean isHasPowerButton() {
        return hasPowerButton;
    }
    public abstract void turnOn();
    public abstract void turnOff();

    @Override
    public String toString() {
        return getClass().getSimpleName()+"{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                '}';
    }
}
