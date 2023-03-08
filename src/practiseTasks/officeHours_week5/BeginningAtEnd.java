package practiseTasks.officeHours_week5;

public class BeginningAtEnd {
    public static void main(String[] args) {
        /*Create a program that will check if the first two characters of a given
        String are also the last two characters of the String.
	 Print true if they are the same and false if they are not the same*/

        String word="yusuf kuyug";
        boolean beginningAtEnd= word.substring(0,2).equalsIgnoreCase(word.substring(word.length()-2));
        if(beginningAtEnd){
            System.out.println(beginningAtEnd);
            return;
        }
        System.out.println(beginningAtEnd);
    }
}
