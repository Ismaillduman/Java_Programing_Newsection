package daily_lessons.day_35_Polymorphism;

import daily_lessons.day_34_abstraction_continue.animal.Animal;
import daily_lessons.day_34_abstraction_continue.animal.Tiger;
import daily_lessons.day_35_Polymorphism.transportaation.*;

public class PolyMorphismPractise {
    public static void main(String[] args) {
        Animal tiger= new Tiger("Shan","Yellow Brown","Big","Bengal",5,'M');
        Tiger tiger2= new Tiger("Shan","Yellow Brown","Big","Bengal",5,'M');

        tiger.eat();
        tiger.drink();
        tiger.sleep();
        //tiger.hunt();
        tiger2.hunt();

        System.out.println("----------------------------------------------------");

        Car car = new Tesla("Tesla","Model Y","White",2020,58000);

        boolean isTesla= car instanceof Tesla;
        boolean isAudi= car instanceof Audi;
        //boolean isElectricCar= car instanceof Tesla;
        boolean isElectricCar= car instanceof Electric;
        boolean hasAutoPark= car instanceof AutoPilot;
        boolean hasAutoPilot= car instanceof AutoPark;
        System.out.println(isTesla);
        System.out.println(isAudi);
        System.out.println(isElectricCar);
        System.out.println(hasAutoPark);
        System.out.println(hasAutoPilot);
    }

}
