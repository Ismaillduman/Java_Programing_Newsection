package daily_lessons.day_32_final_keyword.person;

import daily_lessons.day_03_variables.PrimitiveDataTypes;

import java.time.LocalDate;

public class Employee extends Person{
   private  double salary;
   private String jobTitle;

    public Employee(String name, char gender, LocalDate dateOfBirth, double salary, String jobTitle) {
        super(name, gender, dateOfBirth);
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

//    @Override
//    public void breath() {
//        super.breath();
//    breath method is final, final method can not override}

    @Override
    public String toString() {
        return "Employee{" +
                "salary=" + salary +
                ", jobTitle='" + jobTitle + '\'' +
                super.toString().replace("{","")+
                ' ';
    }
}
