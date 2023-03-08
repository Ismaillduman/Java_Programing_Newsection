package practiseTasks.day_11;

import java.util.Scanner;

public class EmailTask1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter yours email");
        String email= sc.nextLine();


if(email.contains("_")){
    String firstName= email.substring(0,email.indexOf('_'));
    String lastName= email.substring(email.indexOf('_')+1,email.indexOf('@'));
    System.out.println(lastName+"_"+firstName+"@gmail.com");
}else{
    System.out.println("email = " + email);
}



    }
}
