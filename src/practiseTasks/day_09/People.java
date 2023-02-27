package practiseTasks.day_09;

import java.util.Scanner;

public class People {
    public static void main(String[] args) {
        /*Ask the user how many people they live with:
            if user lives with Less than 3 people: print "Live with less than 3 people"
            if the user lives with 3 - 6 people: print "Live with 3 - 6 people"
            if the user lives with more than 6 people: print "Live with "more than 6 people"*/

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter people number");
        int people= sc.nextInt();
        sc.close();

        String result="";
        if(people>0){
            if(people<3){
                result="Live with less than 3 people";
            } else if (people>=3&&people<=6) {
                result="Live with 3 - 6 people";
            }else {
                result="Live with \"more than 6 people\"";
            }
        }else {
            result="invalid number";
        }
        System.out.println("result = " + result);



    }
}
