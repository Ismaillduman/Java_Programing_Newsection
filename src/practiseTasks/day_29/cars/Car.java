package practiseTasks.day_29.cars;

public class Car {
    private String make, model,color;
    private int year;
    private double price;

    public void setInfo(String make, String model, String color, int year, double price) {
       setMake(make);
       setColor(color);
       setModel(model);
       setPrice(price);
       setYear(year);
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
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

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if(!(year<=0)){
            this.year = year;
        }else{
            System.err.println("year can not be zero or negative");
            System.exit(1);
        }

    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if(!(price <=0)){
            this.price = price;
        }else{
            System.err.println("price can not be zero or negative");
            System.exit(1);
        }

    }


    public String toString() {
        return getClass().getSimpleName() +
                " make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", price=" + price +
                '}';
    }
}
