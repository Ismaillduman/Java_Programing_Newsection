package office_hours.officeHours_week5;

public class Reverse {
    public static void main(String[] args) {
        /*Create a program that will have a String that is always 5 characters long.
	 Reverse that given String and print the reverse version

	ex:
		input: hello
		output: olleh*/

        String word = "I believe that everything will be good and one day sun will rise again";

        for (int i = word.length()-1; i >= 0; i--) {
            System.out.print(word.charAt(i));
        }
    }

}
