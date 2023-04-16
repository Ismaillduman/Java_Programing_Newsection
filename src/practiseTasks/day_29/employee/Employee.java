package practiseTasks.day_29.employee;

public class Employee {
    private String name,id,jobTitle;
    private  int age;
    private  double salary;
    private  char gender;
    public void setInfo(String name, String id, String jobTitle, int age, double salary, char gender) {
       setAge(age);
       setGender(gender);
       setId(id);
       setJobTitle(jobTitle);
       setSalary(salary);
       setName(name);

    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age<0){
            System.err.println("age can not be negative");
            System.exit(1);
        }
        if(age>18&&age<65){
            this.age = age; }
        else{
            System.err.println("invalid age: "+age);
            System.exit(1);
        }
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if(salary>0){
            this.salary = salary;
        }else{
            System.err.println("salary can not be negative: "+salary);
        }
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        if(gender=='F'||gender=='M'){
            this.gender = gender;} else{
            System.exit(1);
        }
    }

   public void working(){
       System.out.println(jobTitle+" "+name+" is working");
   }
    public String toString() {
        return getClass().getSimpleName() +
                " name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", gender=" + gender +
                '}';
    }
}
