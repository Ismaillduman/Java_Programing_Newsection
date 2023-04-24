package daily_lessons.day_32_final_keyword.person;

import daily_lessons.day_03_variables.PrimitiveDataTypes;

import java.time.LocalDate;

public class Employee extends Person{
   private  double salary;
   private String jobTitle;

    public Employee(String name, int age, char gender, LocalDate dateOfBirth, double salary, String jobTitle) {
        super(name, age, gender, dateOfBirth);
        setSalary(salary);
        setJobTitle(jobTitle);
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public void work(){
        System.out.println(getName()+" is working");
    }
}
