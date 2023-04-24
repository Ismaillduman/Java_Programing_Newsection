package practiseTasks.day_31.employee;

public class developer extends Employee {
    private String programmingLanguage;

    public developer(String name, String jobTitle, String companyName, String id, int age, double salary, char gender, String programmingLanguage) {
        super(name, jobTitle, companyName, id, age, salary, gender);
        setProgrammingLanguage(programmingLanguage);
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public void work() {
        System.out.println(getJobTitle()+" "+getName()+" is coding "+programmingLanguage);
    }

    /* 2. Developer
                    Extra variable:
                        programmingLanguage

                    work(): jobTitle + name + " is coding in "+programmingLanguage

            3. Teacher
                    work(): name + " is teaching"

            4. Driver
                    work(): name + " is driving"


            if any adidtional field or methods needed, please add them*/
}
