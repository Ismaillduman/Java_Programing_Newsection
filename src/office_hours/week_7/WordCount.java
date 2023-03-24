package office_hours.week_7;

public class WordCount {
    /*T2CountWords [String, loop]
    Create a method that accepts a String and returns an int
        find how many words are in the given String and return that count
        a word is separated by a space
    Ex:
        input: "today is monday"
        output: 3*/
    public static void main(String[] args) {
        System.out.println(word(" to day is mon day "));
    }
    public static int word(String word){

      int count=1;
        for (int i = 0; i < word.trim().length(); i++) {
            if(word.trim().charAt(i)==' '){
                count++;
            }
        }
        return count;
    }
}
