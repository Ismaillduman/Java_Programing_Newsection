package practiseTasks.day_24;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveLetter {
    public static void main(String[] args) {
        ArrayList<Character> list= new ArrayList<>(Arrays.asList('$', 'A', 'B', '1', '2', 'C', 'D', '@', '!', '3', '4'));
        list.removeIf(p->Character.isLetter(p));
        System.out.println(list);

        System.out.println("------------------------------");
        ArrayList<Character> characters= new ArrayList<>(Arrays.asList('$', 'A', 'B', '1', '2', 'C', 'D', '@', '!', '3', '4'));
        characters.removeIf(p->Character.isLetterOrDigit(p));
        System.out.println(characters);
    }
}
