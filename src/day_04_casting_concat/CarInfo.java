package day_04_casting_concat;

public class CarInfo {

    int year;
    String make;
    String model;
    int miles;
    String color;
    int price;
    String unit;



    public CarInfo(int year, String make, String model, int miles, String color, int price, String unit) {
        this.year = year;
        this.make = make;
        this.model = model;
        this.miles = miles;
        this.color = color;
        this.price = price;
        this.unit= unit;
    }

    @Override
    public String toString() {
        return "CarInfo{" +
                "year=" + year +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", miles=" + miles +
                ", color='" + color + '\'' +
                ", price=" + price +
                ", unit='" + unit + '\'' +
                '}';
    }
}
