package day_06;

public class IdentifyNumber {
    public static void main(String[] args) {
        int number= 0;

        boolean isPositive = number > 0;

        boolean isNegative = number< 0;

        boolean isZzero = !isPositive || !isNegative;

        System.out.println(number + " is negative = " + isNegative);
        System.out.println(number + " is positive = " + isPositive);
        System.out.println(number +" zero = " + isZzero);
    }
}
