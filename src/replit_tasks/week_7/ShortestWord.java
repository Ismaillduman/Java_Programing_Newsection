package replit_tasks.week_7;

import java.util.Arrays;

public class ShortestWord {
    public static void main(String[] args) {


        String str = "olive, fish, pursuit, old, warning, python, java, coffee, cat, ray";
        String[] split = str.split(", ");

        int minLength = Integer.MAX_VALUE;
        for (String s : split) {
            if (s.length() < minLength) {
                minLength = s.length();
            }
        }
        int resultLength = 0; //to provide length of result Array

        for (String s : split) {
            if (s.length() == minLength) {
                resultLength++;
            }
        }
        String[] result = new String[resultLength];
        for (int i = 0, j = 0; i < split.length; i++) {
            if (split[i].length() == minLength) {
                result[j++] = split[i];
            }
        }
        System.out.println(Arrays.toString(result));
    }

}
