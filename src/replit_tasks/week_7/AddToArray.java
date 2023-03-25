package replit_tasks.week_7;

import java.util.Arrays;

public class AddToArray {
    public static void main(String[] args) {
        int [] arr={1,2,4,5,8};
        int n=89;
        int[] newArr= new int[arr.length+1];
        for (int i = 0; i < arr.length; i++) {
            newArr[i]=arr[i];
        }
        newArr[newArr.length-1]=n;
        System.out.println(Arrays.toString(newArr));

    }
}
