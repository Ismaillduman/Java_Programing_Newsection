package replit_tasks.week_7;

import java.util.Arrays;

public class ShortestWord {
    public static void main(String[] args) {
        String[] str = {"olive", "fish", "pursuit", "old", "warning", "python", "java", "coffee", "cat", "ray"};

        int minLength = Integer.MAX_VALUE;

        for (String s : str) {
            if (s.length() < minLength) {
                minLength = s.length();

            }

        }


        for (String s : str) {
            if (s.length() == minLength) {
                System.out.println(s);
            }
        }

    }

}
