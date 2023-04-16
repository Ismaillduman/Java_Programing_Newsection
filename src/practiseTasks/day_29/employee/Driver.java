package practiseTasks.day_29.employee;

public class Driver extends Employee {
    public void setInfo(String name,char gender,int age,String id,String jobTitle,double salary){
        setInfo(name, gender, age, id, jobTitle, salary);
    }

    public void driving(){
        System.out.println(getName()+" is driving");
    }
}
