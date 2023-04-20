package daily_lessons.day_31.vehicle;

public class Airplane extends Vehicle{
    public Airplane(String brand, String model, String color, int year, double price) {
        super(brand, model, color, year, price);
    }
    public void flying(){
        System.out.println(getBrand()+" "+getModel()+" is flying");
    }
}
