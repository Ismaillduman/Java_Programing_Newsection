package day_28_encapsulation.encapsulation;

import java.util.Scanner;

public class TestEmployee {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Employee employee= new Employee();
        employee.setSalary(sc.nextDouble());
        System.out.println(employee.getSalary());
    }
}
