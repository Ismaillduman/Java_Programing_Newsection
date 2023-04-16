package practiseTasks.day_29.tester;

public class Tester {

    /*Create a custom Class named Tester
			Variables:
				name, gender, age, id, jobTitle, salary

			Encapsulate all the fields
				Conditions:
					1. gender can only be 'M' or 'F'
					2. age can not be negative
					3. age MUST be between 18 to 65
					4. salary can not be negative

			Methods:
				setInfo(): sets all the fields
				testing()
				toString(): prints tester object info when the object is passed in the print statement*/
    private String name,id,jobTitle;
    private  int age;
    private  double salary;
    private  char gender;

    public Tester(String name, String id, String jobTitle, int age, double salary, char gender) {
       setName(name);
       setId(id);
        setJobTitle(jobTitle);
        setAge(age);
        setSalary(salary);
        setGender(gender);
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
        if(salary>0){ this.salary = salary;
        }else {
            System.err.println("salary can not be negative: "+salary);
            System.exit(1);
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

    public void testing(){
        System.out.println(name+" is testing");
    }
    public String toString() {
        return "Tester{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", gender=" + gender +
                '}';
    }
}
