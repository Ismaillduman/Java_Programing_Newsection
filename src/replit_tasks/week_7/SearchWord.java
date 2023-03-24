package replit_tasks.week_7;

import java.util.Scanner;

class Seach {

    public static int countAppearance(String[] sentence, String word){
        int wordCount=0;
        for (int i = 0; i < sentence.length; i++) {
            if(sentence[i]==word){
                wordCount+=1;
            }
            return wordCount;
        }
        return wordCount;
    }//end  count_appearance

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the length of array:");
        String[] strs = new String[in.nextInt()];
        System.out.println("Enter the search word:");
        String word = in.next();
        for(int i=0; i < strs.length; i++) {
            strs[i] = in.next();
        }

        System.out.println(countAppearance(strs,word));

    }
}