package reviews.review_06;

import java.util.Scanner;

public class ShoppingList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String add = "";
        String list = "";
        int attempts=3;

        do {
            System.out.println("what item do you want to add to the list");
            //String item= sc.nextLine();
            //list+=item;
            list += "\n\t*" + sc.nextLine();
            System.out.println("Do you want to add more items?");
            add = sc.nextLine();

            while(attempts>0&&!add.equalsIgnoreCase("yes")&&!add.equalsIgnoreCase("no")){
                System.out.println("sorry did you wnat to add more items yes or no");
                add=sc.nextLine();
                attempts--;
            }
        } while (add.equalsIgnoreCase("yes"));

        System.out.println(list);
    }
}
