package day_07_if_continue;

public class IfStatementWithOutCurlyBraces {
    public static void main(String[] args) {
        int age=23;
if(age>21){ System.out.println("the person is eligible");
        System.out.println("play java");}

if(age<21) System.out.println("the person is not eligible ");
if(age==0) System.out.println("are you crazy");
else
    System.out.println("Invalid data");

        System.out.println("---------------------------------");
        int day=5;
        if(day<8&&day>0){
        if(day==1) System.out.println("Monday");
        else if(day==2) System.out.println("Tuesday");
        else if(day==3) System.out.println("Wednesday");
        else if(day==4) System.out.println("Thursday");
        else if(day==5) System.out.println("Friday");
        else if(day==6) System.out.println("Saturday");
        else if(day==7) System.out.println("Sunday");
        }
        else System.out.println("invalid day");

    }

}
//curly braces olmadan bir if statement'a sadece bir ifade(exp: System.out.print()) baglayabilirsin
// if statement without curly braces is not best practise