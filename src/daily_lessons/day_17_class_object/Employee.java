package daily_lessons.day_17_class_object;

public class Employee {
    public String name;
    public int age;
    public char gender;
    public String jobTitle;
    public int salary;
    public String employeeId;

    public void setInfo(String name, int age, char gender, String jobTitle, int salary, String employeeId) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.jobTitle = jobTitle;
        this.salary = salary;
        this.employeeId = employeeId;
    }


    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                ", employeeId='" + employeeId + '\'' +
                '}';
    }
    public void work(){
        System.out.println(name+" is working");
    }
}
