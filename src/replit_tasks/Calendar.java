package replit_tasks;

import java.util.Scanner;

public class Calendar {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter month number:");
        int monthNum = scan.nextInt();
String result="";
        if(monthNum>0&&monthNum<=12){

            switch (monthNum){
                case 1:
                    result="January";
                    break;
                case 2:
                    result= "Februar";
                    break;
                case 3:
                    result= "März";
                    break;
                case 4:
                    result= "April";
                    break;
                case 5:
                    result= "May";
                    break;
                case 6:
                    result= "Juni";
                    break;
                case 7:
                    result= "Juli";
                    break;
                case 8:
                    result= "August";
                    break;
                case 9:
                    result= "September";
                    break;
                case 10:
                    result= "October";
                    break;
                case 11:
                    result= "November";
                    break;
                case 12:
                    result= "December";
            }}
        else{
            result="Invalid month number";
        }
        System.out.println(result);
    }
}

/*int day = 4;
switch (day) {
  case 1:
    System.out.println("Monday");
    break;
  case 2:
    System.out.println("Tuesday");
    break;
  case 3:
    System.out.println("Wednesday");
    break;
  case 4:
    System.out.println("Thursday");
    break;
  case 5:
    System.out.println("Friday");
    break;
  case 6:
    System.out.println("Saturday");
    break;
  case 7:
    System.out.println("Sunday");
    break;
}*/