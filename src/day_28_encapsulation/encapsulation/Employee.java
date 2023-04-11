package day_28_encapsulation.encapsulation;

import java.util.Scanner;

public class Employee {
    Scanner sc = new Scanner(System.in);
    //encapsulation only for when you have instance variable

    private String name;
    private int age;
    private String jobTitle;
    private double salary;

    public Employee(String name, int age, String jobTitle, double salary) {
        setName(name);
        setSalary(salary);
        setAge(age);
        setJobTitle(jobTitle);

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 16) {
            System.err.println("invalid age " + age);
            System.exit(1);
        }
        this.age = age;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        if (jobTitle.isEmpty() || jobTitle.isBlank()) {
            System.err.println("job Title  can not be empty or blank");
            System.exit(1);
        }
        this.jobTitle = jobTitle;
    }

    public String getName() {
        if (name == null) {
            return "Unknown";
        }
        return name;
    }

    public void setName(String name) {
        if (name.isEmpty() || name.isBlank()) {
            System.err.println("Employee name can not be empty or blank");
            System.exit(1);
        }
        for (char each : name.toCharArray()) {
            if (Character.isDigit(each)) {
                System.err.println("name can not contain the digit");
                System.exit(1);
            }
        }
        this.name =name;
    }



    public double getSalary() {
        if (salary == 0.0) {
            System.err.println("Salary can not be " + salary + " enter new amount");
            salary = sc.nextDouble();
        }
        return salary;
    }

    public void setSalary(double salary) {
        while (salary < 0) {
            System.err.println("salary is invalid please enter a valid salary");
            salary = sc.nextDouble();

        }
        if (salary < 0) {
            System.err.println("invalid amount");
            System.exit(1);
        }
        this.salary = salary;
    }


    public String toString() {
        return "Employee{" +
                ", name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", jobTitle='" + getJobTitle() + '\'' +
                ", salary=" + getSalary() +
                '}';
    }
}
