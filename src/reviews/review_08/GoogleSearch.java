package reviews.review_08;

import java.util.Arrays;

public class GoogleSearch {
    public static void main(String[] args) {
        String result = "About 40,000,000 results (0.39 seconds)";
        String[] eachPart = result.split(" ");
        System.out.println(Arrays.toString(eachPart));
        long resultNum = Long.parseLong(eachPart[1].replace(",", ""));
        System.out.println(resultNum);
        if (resultNum < 100_000_000) {
            System.out.println("Good Search");
        } else {
            System.out.println("Narrow your search. Too many Result: " + resultNum);
        }
        System.out.println(eachPart[3]);
        //double time=Double.parseDouble(eachPart[3].replace("(",""));
        double resultTime = Double.parseDouble(eachPart[3].substring(1));
        if (resultTime <= 0.85) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
        }
        System.out.println(resultTime <= 0.85 ? "PASS" : "FAIL");

    }
}
