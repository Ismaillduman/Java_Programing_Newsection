package replit_tasks.tasks_week_4;

import java.util.Scanner;

public class j {
    public static void main(String[] args) {
//        String word="javax";
//        String result="";
//
//        for (int i = word.length()-1; i >=0; i--) {
//            String letters=String.valueOf(word.charAt(i));
//            result+=letters;
//    }
//        System.out.println(result);

        boolean exists = false;
        Scanner scan = new Scanner(System.in);
        //String name = scan.nextLine();
double age=100;
String name= "Ismail adghjkuman";



        int zipCode=12568;
String educationLevel="Bachelors";
        //WRITE YOUR CODE BELOW:
String firstName= name.substring(0,1).toUpperCase()+name.substring(1,name.indexOf(" "));
String lastName=name.substring(name.indexOf(" ")+1,name.indexOf(" ")+2).toUpperCase()+name.substring(name.indexOf(" ")+2);
        String referenceNumber= firstName.substring(0,2).toUpperCase()+age+lastName.substring(lastName.length()-3).toUpperCase()
                +zipCode+educationLevel.replaceAll(" ","").toUpperCase();
        System.out.println(referenceNumber);
//        System.out.println(lastName.substring(lastName.indexOf(lastName)+2).toUpperCase());
////        System.out.println(firstName+" "+lastName);
////         System.out.println(word.startsWith("java") || word.substring(1).startsWith("java"));
////
////        if (word.contains("java")) {
////            String scnSpeech = "" + word.charAt(1);
////            if (word.startsWith("j") ) {
////                System.out.println("true");
////            } else if (scnSpeech.equalsIgnoreCase("j")) {
////                System.out.println("true");
////            } else {
////                System.out.println("false");
////            }
////        } else {
////            System.out.println("false");
////        }

    }
}
