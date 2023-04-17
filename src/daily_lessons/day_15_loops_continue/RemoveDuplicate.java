package daily_lessons.day_15_loops_continue;

import java.util.Scanner;

public class RemoveDuplicate {
    public static void main(String[] args) {
        //removeDuplicate();
        rmvDuplicate();
    }

    public static String removeDuplicate() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your word");

        String word = sc.nextLine();
        String wordWithOutDuplicate = "";

        for (int i = 0; i < word.length(); i++) {

            char each = word.charAt(i);

            if (!wordWithOutDuplicate.contains("" + each)) {
                wordWithOutDuplicate += each;

            }
        }
        System.out.println(wordWithOutDuplicate);
        return wordWithOutDuplicate;
    }


    public static void rmvDuplicate() {



        String word = "abcdfhab";
        String withOutDuplicate = "";

        for (int i = 0; i < word.length(); i++) {

            for(int j=i+1;j<word.length();j++){
                System.out.println(word.charAt(i)+"++++"+word.charAt(j));
                if(word.charAt(i)==word.charAt(j)){
                    withOutDuplicate=word.replace(""+word.charAt(j),"");
                }
            }

//            char each = word.charAt(i);
//
//            if (!withOutDuplicate.contains("" + each)) {
//                withOutDuplicate += each;
//
//            }
        }
        //System.out.println(withOutDuplicate);

    }
}

