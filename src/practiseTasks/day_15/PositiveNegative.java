package practiseTasks.day_15;

import java.util.Scanner;

public class PositiveNegative {


    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

       int positiveCounts=0;
       int negativeCounts=0;
        System.out.println("how many number you want to entry");
        int numsCount=sc.nextInt();
        for(int i=0;i<numsCount;i++){

            System.out.println("Enter your numbers");
            int nums=sc.nextInt();

            while (nums==0){
                System.err.println("Enter positive or negative number");
                nums=sc.nextInt();
            }

            if(nums<0){
                negativeCounts+=1;
            }else{positiveCounts+=1;}


        }
        System.out.println("positiveCounts: "+positiveCounts+"\nnegativesCount: "+negativeCounts);

    }
}
