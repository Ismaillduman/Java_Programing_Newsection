package daily_lessons.day_25;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

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
    } //allow us to set all the instance variables of the object as soon as tje object created

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", gender=" + gender +
                ", hiredDate=" + hiredDate.format(DateTimeFormatter.ofPattern("MMMM/dd/yy")) +
                '}';
    }// allow us to print the object
}
