package daily_lessons.day_35_Polymorphism.transportaation;

import daily_lessons.day_34_abstraction_continue.animal.Flyable;

public abstract class Plane extends Transportation implements Flyable {
    public Plane(String make, String model, String color, int year, double price) {
        super(make, model, color, year, price);
    }
    public void land(){
        System.out.println("Plane "+getMake()+" "+getModel()+" is landing");
    }

    @Override
    public void fly() {
        System.out.println(getMake()+" "+getModel()+" is Flying");
    }
}
