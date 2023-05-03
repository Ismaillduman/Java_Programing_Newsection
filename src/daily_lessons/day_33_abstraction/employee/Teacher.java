package daily_lessons.day_33_abstraction.employee;

public class Teacher extends Employee {

    // Employee employee=new Employee("kevin",45,'m',"asd12","sdet",50000);
    // we can not create an object from abstract class
    //and an abstract method can not be existed in a non-abstract class
    // because of that i have to override the abstract methods
    //every single method have to a body in the non-abstract class
// parent class abstract methods must be override in child (non abstract) class
    public Teacher(String name, int age, char gender, String id, String jobTitle, double salary) {
        super(name, age, gender, id, jobTitle, salary);
    }

    @Override
    public void work() {
        System.out.println(getName()+" is teaching");
    }
}
