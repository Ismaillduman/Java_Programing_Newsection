package practiseTasks.day_23;

import java.util.ArrayList;
import java.util.Arrays;

public class MultiplyOddNum {
    public static void main(String[] args) {
        ArrayList<Integer> num= new ArrayList<>(Arrays.asList(1,2,3,4,5,6));
        for (int i = 0; i < num.size(); i++) {
            if(num.get(i)%2!=0){
                num.set(i,num.get(i)*2);
            }
        }
        System.out.println(num);
    }
}
