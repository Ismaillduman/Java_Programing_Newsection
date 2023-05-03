package daily_lessons.day_34_abstraction_continue.car;

public class Honda extends Car{
    public Honda(String make, String model, String color, int year, double price) {
        super(make, model, color, year, price);
    }

    @Override
     public void start() {
        System.out.println("Twist the key to ignition to start "+getMake()+" "+getModel());
    }

}
