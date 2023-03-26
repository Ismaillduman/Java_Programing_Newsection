package reviews.review_07;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Countries {
    public static void main(String[] args) {
        String[] countries = {
                "Brazil", "China", "Cuba", "United States", "Sweden", "France", "Vietnam",
                "Albania", "Portugal", "Philippines", "Armenia",  "Colombia",
                "Honduras", "Indonesia"
        };

        /*







   */

        System.out.println(" //- Find the largest and smaller countries based on the length of their names");

        int large=Integer.MIN_VALUE;


        for (int i = 0; i < countries.length; i++) {
            if(countries[i].length()>large){
               large= countries[i].length();

            }
        }
        for (String country : countries) {
            if(country.length()==large){
                System.out.println(country);
            }
        }
        int small=Integer.MAX_VALUE;
        for (int i = 0; i < countries.length; i++) {
            if(countries[i].length()<small){
                small= countries[i].length();

            }
        }
        for (String country : countries) {
            if(country.length()==small){
                System.out.println(country);
            }
        }

        System.out.println("//- Find and print all the first and last characters");

        for (String country : countries) {
           String str=""+ country.charAt(0)+country.charAt(country.length()-1);
            System.out.println(str);
        }

        System.out.println("  - Show all the countries that start with a 'C'");

        for (String country : countries) {

            if(country.toLowerCase().startsWith("c")){
                System.out.println(country);
            }
        }

        System.out.println("  - Show all the countries that end with an 's'");

        for (String country : countries) {

            if(country.toLowerCase().endsWith("s")){
                System.out.println(country);
            }
        }
        System.out.println("- Show the countries names in alphabetical order*/");

        Arrays.sort(countries);
        System.out.println(Arrays.toString(countries));


    }
}
