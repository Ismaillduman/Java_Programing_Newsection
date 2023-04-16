package daily_lessons.day_03_variables;


public class EmployeeInfo {

    String name;
    int age;
    String gender;
    String companyName;
    long employeeId;
    String jobTitle;
    int salary;
    boolean isFullTime;

    public EmployeeInfo(String name, int age, String gender, String companyName, long employeeId, String jobTitle, int salary, boolean isFullTime) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.companyName = companyName;
        this.employeeId = employeeId;
        this.jobTitle = jobTitle;
        this.salary = salary;
        this.isFullTime = isFullTime;
    }



    @Override
    public String toString() {
        return "EmployeeInfo{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", companyName='" + companyName + '\'' +
                ", employeeId=" + employeeId +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                ", isFullTime=" + isFullTime +
                '}';
    }

}
