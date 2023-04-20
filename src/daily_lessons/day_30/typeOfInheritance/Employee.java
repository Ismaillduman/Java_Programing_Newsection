package daily_lessons.day_30.typeOfInheritance;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Employee extends Person {
    private String jobTitle;
    private String employeeId;
    private double salary;

    public Employee(String name, int age, char gender, LocalDate DOB, String jobTitle, String employeeId, double salary) {
        super(name, age, gender, DOB);
        setJobTitle(jobTitle);
        setSalary(salary);
        setEmployeeId(employeeId);

    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void work(){
        System.out.println(getName()+" is working");
    }
}