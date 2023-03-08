package practiseTasks.day_11;

import java.util.Scanner;

public class EmailTask2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter yours email");
        String email= sc.nextLine();

        String firstName= email.substring(0,email.indexOf("_")).substring(0,1).toUpperCase()+email.substring(1,email.indexOf("_"));
        System.out.println("firstName = " + firstName);
        String lastName= email.substring(email.indexOf("_")+1,email.indexOf("@")).substring(0,1).toUpperCase()+email.substring(email.indexOf("_")+2,email.indexOf("@"));
        System.out.println("lastName = " + lastName);
        String domain= email.substring(email.indexOf('@')+1,email.indexOf("."));
        System.out.println("domain = " + domain);



    }
}
