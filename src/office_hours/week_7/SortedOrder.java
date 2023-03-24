package office_hours.week_7;

public class SortedOrder {
    public static void main(String[] args) {
            /*
    T3SortedOrder [loop, String]
    Create a method that accepts a String and returns a boolean.
        return true if the given String is sorted meaning the characters are in alphabetically order
        return false if the given String is not sorted
    Ex:
        input: "abcd"
        output: true
        input: "abzy"
        output: false
     */
        System.out.println(sortedOrder((" abcd")));
        System.out.println(sortedOrder(("abxcd")));
    }

    public static boolean sortedOrder(String str){
        for (int i = 0; i < str.length()-1; i++) {
            if(str.toLowerCase().charAt(i)>str.toLowerCase().charAt(i+1)){
                return false;
            }
        }

       return true;
    }
}
