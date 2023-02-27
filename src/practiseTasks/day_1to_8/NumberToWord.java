package practiseTasks.day_1to_8;

public class NumberToWord {
    public static void main(String[] args) {
        /* Create a class called NumberToWord,
		write a java program that can convert numbers between 0 ~ 9 to words
			Ex:
				number = 1;

			output:
				One

		Note: MUST use ternary
*/

        int num = 20;
        String result;

        result = (num == 0) ? "zero" : (num == 1) ? "one" : (num == 2) ? "two" : (num == 3) ? "three" : (num == 4) ? "vier" :
                (num == 5) ? "fünf" : (num == 6) ? "sechs" : (num == 7) ? "sieben" : (num == 8) ? "acht" : (num == 9) ? "neun" : "enter valid number";


        System.out.println("result = " + result);


    }
}
