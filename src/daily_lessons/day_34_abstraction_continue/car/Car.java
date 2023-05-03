package daily_lessons.day_34_abstraction_continue.car;

public abstract class Car {
    private final String make,model;
    private String color;
    private final int year;
    private double price;


    public Car(String make, String model, String color, int year, double price) {
        this.make = getClass().getSimpleName();
        this.model = model;
        this.color = color;
        if(year<1886){
            System.err.println("invalid year "+year);
            System.exit(1);
        }
        this.year = year;
        if(price<=0){
            System.err.println("Invalid price "+price);
            System.exit(1);
        }
        this.price = price;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPrice(double price) {
        if(price<=0){
            System.err.println("Invalid price");
            System.exit(1);
        }
        this.price = price;
    }
    protected final void stop(){  //when i want to never change final keyword
        System.out.println("Press the break to stop"+make+" "+model);
    }
    protected abstract void start();

    @Override
    public String toString() {
        return make+"{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", price= $" + price +
                '}';
    }
}
