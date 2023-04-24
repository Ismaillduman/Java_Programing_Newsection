package practiseTasks.day_31.employee;

public class Tester extends Employee{
    public Tester(String name, String jobTitle, String companyName, String id, int age, double salary, char gender) {
        super(name, jobTitle, companyName, id, age, salary, gender);
    }

    @Override
    public void work() {
        System.out.println(getJobTitle()+" "+getName()+" is testing");
    }

    /*Create the following subclasses and override the work method in each subclass:

            1. Tester
                    work(): jobTitle + " " + name + " is testing"

           */
}
