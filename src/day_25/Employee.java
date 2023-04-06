package day_25;

import java.time.LocalDate;

public class Employee {
    public String name,jobTitle;
    public int age;
    public double salary;
    public char gender;
    public LocalDate hiredDate;

    public Employee(String name, String jobTitle, int age, double salary, char gender, LocalDate hiredDate) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.age = age;
        this.salary = salary;
        this.gender = gender;
        this.hiredDate = hiredDate;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", gender=" + gender +
                ", hiredDate=" + hiredDate +
                '}';
    }
}
