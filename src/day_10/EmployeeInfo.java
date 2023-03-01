package day_10;

import java.util.Scanner;

public class EmployeeInfo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your fullName");
        String fullName = sc.nextLine();
        System.out.println("Enter your age");
        byte age = sc.nextByte();
        System.out.println("Enter your gender");
        char gender = sc.next().charAt(0);
        System.out.println("Enter your Company");
        sc.nextLine();
        String companyName = sc.nextLine();
        System.out.println("Enter your job title");
        String jobTitle = sc.nextLine();
        System.out.println("Enter your salary");
        double salary = sc.nextDouble();

        System.out.println("Employees info: \n\t\tName: " + fullName + "\n\t\tAge: " + age + "\n\t\tGender: " +
                gender + "\n\t\tCompanyName: " +
                companyName + "\n\t\tJobTitle: " + jobTitle + "\n\t\tSalary: " + salary + " Euro Brutto");
        sc.close();
    }
}
