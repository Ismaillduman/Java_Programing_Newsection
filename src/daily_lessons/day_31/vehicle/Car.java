package daily_lessons.day_31.vehicle;

public class Car extends Vehicle {

    // A constructor can invoke only with another constructor
    public Car(String brand, String model, String color, int year, double price) {
        super(brand, model, color, year, price);
    }
    public  void drive(){
        System.out.println("Driving "+getBrand());
    }
}
