package practiseTasks.day_15;

import java.util.Scanner;

public class Credentials {
    public static void main(String[] args) {
        /*you are writing a code for the log-in function of the Cydeo Application, assume that your credentials are:
                    username: Cydeo
                    password: Cydeo123

        Ask the user to enter their credentials.
                If credentials are matched, your program should print "Logged in."
                If the credentials are not matched,
                the program should allow the user to have three attempts to enter correct credentials and
                if all three attempts are failed, then print "Your account is lucked."
*/
        String username = "Cydeo";
        String password = "Cydeo123";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your user name");
        String my_username = sc.nextLine();
        System.out.println("Enter password");
        String my_password = sc.nextLine();

        if (my_username.equals(username) && my_password.equals(password)) {
            System.out.println("Logged in.");
        }

        while (!(my_username.equals(username) && my_password.equals(password))) {
            for (int i = 1; i < 3; i++) {
                if(!(i==2)){
                    System.err.println("Wrong password or username please re-enter");
                }else{
                    System.err.println("That's your last chance");
                }

                System.out.println("Enter your username again");
                my_username = sc.next();
                System.out.println("Enter your password again");
                my_password = sc.next();
                if (my_username.equals(username) && my_password.equals(password)) {
                    System.out.println("Logged in.");
                    break;
                }


            }
            if (!(my_username.equals(username) && my_password.equals(password))) {
                System.err.println("Your account is locked.");
            }
            break;
        }
    }
}
