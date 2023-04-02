package utilities;
import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListUtility {

    public static int countCharInList(ArrayList<String> list, char letter) {
        int count = 0;
        for (String eachWord : list) {
            for (char eachletter : eachWord.toCharArray()) {
                if (eachletter == letter) {
                    count++;
                }


            }
        }
        return count;
    }
}
