package practiseTasks.day_31.employee;

public class Driver extends  Employee{

    public Driver(String name, String jobTitle, String companyName, String id, int age, double salary, char gender) {
        super(name, jobTitle, companyName, id, age, salary, gender);
    }

    @Override
    public void work() {
        System.out.println(getName()+" is driving");
    }
    /* 4. Driver
                    work(): name + " is driving"*/

}
