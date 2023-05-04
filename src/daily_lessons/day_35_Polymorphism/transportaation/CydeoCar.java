package daily_lessons.day_35_Polymorphism.transportaation;

import daily_lessons.day_34_abstraction_continue.animal.Flyable;
import daily_lessons.day_34_abstraction_continue.animal.Swimmable;

public class CydeoCar extends Car implements Flyable,Electric,AutoPilot, Swimmable {
    public CydeoCar(String make, String model, String color, int year, double price) {
        super(make, model, color, year, price);
    }

    @Override
    public void fly() {

    }

    @Override
    public void autoPark() {

    }

    @Override
    public void selfDrive() {

    }

    @Override
    public void charge() {

    }

    @Override
    public void transportPeople() {

    }

    @Override
    public void start() {

    }

    @Override
    public void swim() {

    }
}
