package reviews.review_08;

import java.util.ArrayList;
import java.util.Arrays;

public class CountChar {
    public static void main(String[] args) {
        ArrayList<String> list= new ArrayList<>(Arrays.asList("java","html","java","typescript","css"));
        System.out.println(countCharInList(list, 's'));


    }
    public static int countCharInList(ArrayList<String> list, char letter){
        int count=0;
        for (String eachWord : list) {
            for(char eachletter:eachWord.toCharArray()){
                if(eachletter==letter){
                    count++;
                }


            }
        }
        return count;
    }

}
