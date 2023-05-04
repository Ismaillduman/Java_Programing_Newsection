package practiseTasks.day_34.car;

import daily_lessons.day_34_abstraction_continue.animal.Flyable;

public class CydeoCar extends Car implements AutoPilot,AutoPark, Flyable {
    public CydeoCar(String model, int year, double price, String color) {
        super(model, year, price, color);
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
    public void start() {

    }

    @Override
    public void drive() {

    }
}
