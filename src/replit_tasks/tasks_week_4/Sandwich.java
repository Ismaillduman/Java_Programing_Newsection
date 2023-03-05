package replit_tasks.tasks_week_4;

import java.util.Scanner;

public class Sandwich {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str= sc.nextLine();

if(str.indexOf("bread")==str.lastIndexOf("bread")){
    System.out.println("nothing");
}else {

    System.out.println(str.substring(str.indexOf("bread")+5,str.lastIndexOf("bread")));
}






    }
}
