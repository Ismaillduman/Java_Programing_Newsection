package daily_lessons.day_34_abstraction_continue.car;

public class Audi extends Car {
    public Audi(String make, String model, String color, int year, double price) {
        super(make, model, color, year, price);
    }

    @Override
    public void start() {
        System.out.println("Pres the start button " + getMake() + " " + getModel());
    }

    public void autoPark() {
        System.out.println(getMake()+" "+getModel()+" has auto park feature");
    }
}
