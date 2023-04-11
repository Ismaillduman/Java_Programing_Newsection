package day_28_encapsulation.encapsulation;

import java.util.Scanner;

public class TestEmployee {
    public static void main(String[] args) {
//        System.out.println("Enter salary");
//        Scanner sc = new Scanner(System.in);
//
//        Employee employee = new Employee();
//
//        employee.setSalary(sc.nextDouble());
//        System.out.println(employee.getSalary());
//
//        //employee.setName(" ");
//        System.out.println(employee.getName());
        Employee employee1=new Employee("ismail",39,"SDET",55000);
        System.out.println(employee1);
    }
}
