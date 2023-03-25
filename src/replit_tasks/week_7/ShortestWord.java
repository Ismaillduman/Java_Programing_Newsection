package replit_tasks.week_7;

import java.util.Arrays;

public class ShortestWord {
    public static void main(String[] args) {
        String[] str1 = {"olive", "fish", "pursuit", "old", "warning", "python", "java", "coffee", "cat", "ray"};

//        int minLength = Integer.MAX_VALUE;
//
//        for (String s : str1) {
//            if (s.length() < minLength) {
//                minLength = s.length();
//
//            }
//
//        }
//
//
//        for (String s : str1) {
//            if (s.length() == minLength) {
//                System.out.println(s);
//            }
//        }

        String str = "olive, fish, pursuit, old, warning, python, java, coffee, cat, ray";
        String[] split = str.split(", ");
        // System.out.println(Arrays.toString(split));

        int minLength = Integer.MAX_VALUE;

        for (String s : split) {
            if (s.length() < minLength) {
                minLength = s.length();

            }

        }
        int count = 0;

        for (String s : split) {
            if(s.length()==minLength){
                count++;
            }
        }

        String [] result= new String[count];
        for (int i = 0,j=0; i < split.length; i++) {
            if(split[i].length()==minLength){
                result[j++]=split[i];
            }

        }
        System.out.println(Arrays.toString(result));
    }

}
