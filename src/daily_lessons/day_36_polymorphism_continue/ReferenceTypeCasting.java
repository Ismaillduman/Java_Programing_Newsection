package daily_lessons.day_36_polymorphism_continue;


import daily_lessons.day_29_inheritance.animalTask.Animal;
import daily_lessons.day_29_inheritance.animalTask.Dog;
import daily_lessons.day_33_abstraction.employee.*;
import daily_lessons.day_35_Polymorphism.transportaation.*;
import practiseTasks.day_30.phone.Nokia;
import practiseTasks.day_30.phone.Phone;

public class ReferenceTypeCasting {
    public static void main(String[] args) {
        Dog dog = new Dog();

        Animal animal = (Animal) new Dog(); //implicit casting
        System.out.println("----------------------------------");
        Animal animal1 = new Dog(); //upcasting polymorphism
        animal1.setInfo("Max","Golden","Yellow","Medium",'M',6);
        animal1.eat();
        animal1.drink();
        animal1.sleep();
        //animal1.bark();

        ((Dog) animal1).bark(); // "down casting"
        System.out.println("---------------------------------");

        Phone phone = new Nokia("3110","Big","Blue",25);
        phone.call(14578);
        phone.text(145789);
        ((Nokia)phone).selfDefense(); //down casting when i want to use child class properties with parent class reference

        System.out.println("-------------------------------------");

        Employee employee = new Developer("Lucy", 30, 'F', "C1", "Java Developer", 95000, "Java");
employee.work();
        System.out.println(((Developer) employee).getProgrammingLanguage());
        System.out.println("2----------------------------------------");
        Electric electric = new Tesla("Tesla", "Model Y", "Blue", 2020, 55000);

        electric.charge();
        ((Tesla)electric).selfDrive();
        ((AutoPilot)electric).selfDrive();

    }
}
