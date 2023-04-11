package day_28_encapsulation.encapsulation;

import java.util.Scanner;

public class Employee {
    Scanner sc= new Scanner(System.in);
    //encapsulation only for when you have instance variable
    private double salary;

    public double getSalary() {
        if(salary==0.0){
            System.err.println("Salary can not be "+ salary+" enter new amount");
            salary=sc.nextDouble();
        }
        return salary;
    }

    public void setSalary(double salary) {
        while (salary<0){
            System.err.println("salary is invalid please enter a valid salary");
            salary=sc.nextDouble();

        }
        if(salary<0){
            System.err.println("invalid amount");
            System.exit(1);
        }
        this.salary = salary;
    }
}
