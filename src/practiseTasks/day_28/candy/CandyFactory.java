package practiseTasks.day_28.candy;

import java.util.ArrayList;
import java.util.Arrays;

public class CandyFactory {
    /*5.1 Create a class named CandyFactory
                Create an ArrayList of candies
                Add five objects of candies
                use for each loop to print the brand and price of each candy*/


    public static void main(String[] args) {
        Candy candy1 = new Candy("Milka", 4, 20, true);
        Candy candy2 = new Candy("Nestle", 1, 6, true);
        Candy candy3 = new Candy("Raffaello", 2, 13, false);
        Candy candy4 = new Candy("merci", 7, 21, true);
        Candy candy5 = new Candy("lindt", 1, 0, false);
        ArrayList<Candy> candies = new ArrayList<>(Arrays.asList(candy1, candy2, candy3, candy4, candy5));

        for (Candy eachCandy : candies) {
            System.out.println(eachCandy.getQuantity()+" "+eachCandy.getBrand() + " price " + eachCandy.getPrice());
        }
    }

}
