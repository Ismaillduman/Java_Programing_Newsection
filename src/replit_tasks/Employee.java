package replit_tasks;

public class Employee {
    public static void main(String[] args) {

        String firstName = "Noah ";

        String lastName = "Smith";

        String companyName = "Apple";

       int salary = 200_000;

        String startDay = "10";

        String startMonth = "1";

        String startYear = "2022";

        boolean fullTime = true;
        String jobTitle = "SDET";

        String office_address = "One Apple Park Way, Cupertino, CA 95014";

         String fullName= firstName + lastName;

         String fullStartDate= (startMonth + startYear);

         String email= firstName + startDay+ "@"+ companyName+".com";

         int SALARY_2_YEARS= salary * 15/100 + salary;




        System.out.println("Employee Information");
        System.out.println("We have "+ fullName+ " joining " +companyName);
        System.out.println(firstName+ " will start on "+ fullStartDate+ " as full time "+ fullTime);
        System.out.println(firstName+ "here is some information about your employment" );
        System.out.println("Your email is "+ email);
        System.out.println("Your base salary is $"+salary+" and after 2 years it will be $"+SALARY_2_YEARS);
        System.out.println("Welcome aboard, see you at "+office_address);

    }
}
