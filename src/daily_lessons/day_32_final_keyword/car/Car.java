package daily_lessons.day_32_final_keyword.car;

public class Car {
    private String model,color,make;
    private int year;
    private double price;
    public  static int numberOfWheels;
    public  static  boolean hasBattery;

    public Car(String model, String color,int year, double price) {

        setModel(model);
        setColor(color);
        setMake(getClass().getSimpleName());
        setYear(year);
       setPrice(price);
    }

    static {
        numberOfWheels=4;
        hasBattery=true;
    }
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if(year<=0){
            System.err.println("invalid year "+year);
            System.exit(1);
        }
        this.year = year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if(price<=0){
            System.err.println("invalid price "+price);
            System.exit(1);
        }
        this.price = price;
    }
public  void start(){
    System.out.println("Press the brake and twist the key to ignition to start "+ make+" "+model);
}
    @Override
    public String toString() {
        return make+"{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", price=" + price +
                '}';
    }
}
