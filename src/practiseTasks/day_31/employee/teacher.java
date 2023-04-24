package practiseTasks.day_31.employee;

public class teacher extends Employee{
    public teacher(String name, String jobTitle, String companyName, String id, int age, double salary, char gender) {
        super(name, jobTitle, companyName, id, age, salary, gender);
    }

    @Override
    public void work() {
        System.out.println(getName()+" is teaching");
    }
    /* 3. Teacher
                    work(): name + " is teaching"

            4. Driver
                    work(): name + " is driving"


            if any adidtional field or methods needed, please add them*/

}
