package practiseTasks.day_29.developer;

import java.util.ArrayList;
import java.util.Arrays;

public class Developer {
    /*
					1. gender can only be 'M' or 'F'
					2. age can not be negative
					3. age MUST be between 18 to 65
					4. salary can not be negative
					5. programming language can only be set to one of the followings:
						{"Java", "JavaScript", "Python", "Ruby", "C#", "C++", "Swift"}

			Methods:
				setInfo(): sets all the fields (including programmingLanguage)
				coding()
				toString(): prints developer object info when the object is passed in the print statement*/
    private String name,id,jobTitle,programmingLanguage;
    private  int age;
    private  double salary;
    private  char gender;

    public void setInfo(String name, String id, String jobTitle, String programmingLanguage, int age, double salary, char gender) {
        setId(id);
        setAge(age);
        setJobTitle(jobTitle);
        setSalary(salary);
        setName(name);
        setGender(gender);
        setProgrammingLanguage(programmingLanguage);

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

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        ArrayList<String > language= new ArrayList<>(Arrays.asList("Java", "JavaScript", "Python", "Ruby", "C#", "C++", "Swift"));
        if(language.contains(programmingLanguage)) {
            this.programmingLanguage = programmingLanguage;
        }else{
            System.err.println("Invalid Language: "+programmingLanguage);
        }
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

public void coding(){
    System.out.println(name+" is coding");
}

    public String toString() {
        return "Developer{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", programmingLanguage='" + programmingLanguage + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", gender=" + gender +
                '}';
    }
}
