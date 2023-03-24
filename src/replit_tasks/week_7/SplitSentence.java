package replit_tasks.week_7;

import java.util.Arrays;

public class SplitSentence {
    public static void main(String[] args) {
        String sentence= "I love to learn new Topics";

      String []splitSentence= sentence.split(" ");
        //System.out.println(Arrays.toString(splitSentence));
        for (int i = 0; i < splitSentence.length; i++) {
            String s=splitSentence[i];
            System.out.println(s);
        }
    }
}
