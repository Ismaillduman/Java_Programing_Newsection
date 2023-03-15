package replit_tasks.week_6;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class CatDog {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        int countDog = 0;
        int countCat = 0;
        boolean result=true;

        for (int i = 0; i < str.length() - 2; i++) {
            String cat = "cat",
                    dog = "dog";

            if (str.substring(i, i + 3).equalsIgnoreCase(dog)) {
                    countDog++;
                }
                if (str.substring(i, i + 3).equalsIgnoreCase(cat)) {
                    countCat++;
                }

        }
//        System.out.println("countCat = " + countCat);
//        System.out.println("countDog = " + countDog);
        if(countDog==0&&countCat==0){
            result=false;
        }
        if(countDog!=0||countCat!=0){
            if (countDog == countCat) {
                result= true;
            }else{result=false;}
        }

        System.out.println(result);
    }
}