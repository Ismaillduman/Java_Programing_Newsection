package daily_lessons.day_34_abstraction_continue.car;

public class Tesla extends Car{
    public Tesla( String model, String color, int year, double price) {
        super(model, color, year, price);
    }

    @Override
    protected void start() {
        System.out.println("use voice control to start "+getMake()+" "+getModel());
    }
    public void autopilot(){
        System.out.println(getMake()+" "+getModel()+" has auto pilot");
    }
}
