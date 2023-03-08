package replit_tasks.tasks_week_4;

import java.util.Scanner;

public class Email {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String email = sc.nextLine();

        String firstName = email.substring(0, email.indexOf(" "));
        String lastName = email.substring(email.indexOf("_") + 1, email.indexOf("@"));
        String domain = email.substring(email.indexOf("@") + 1, email.indexOf("."));

        System.out.println("First name: " + firstName.substring(0, 1).toUpperCase() + firstName.substring(1));
        System.out.println("Last name: " + lastName.substring(0, 1).toUpperCase() + lastName.substring(1));
        System.out.println("Domain: " + domain.substring(0, 1).toUpperCase() + domain.substring(1));

        System.out.println(email.toUpperCase());





    }
}
