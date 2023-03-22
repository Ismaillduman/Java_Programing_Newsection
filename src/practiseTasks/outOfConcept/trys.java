package practiseTasks.outOfConcept;

import java.util.Arrays;
import java.util.Scanner;

public class trys {


    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        int[] nums = new int[3];
//        for(int i =0; i < 3; i++) {
//            nums[i] = scan.nextInt();
//        }
//
//        //WRITE YOUR CODE BELOW
//
//        System.out.println(Arrays.toString(Arrays.copyOf(nums, 6)));

        //DO NOT TOUCH FOLLOWING LINE/LINES
//        Scanner scan = new Scanner(System.in);
//        int size = scan.nextInt();
//        int[] nums = new int[size];
//        for(int i =0; i < size; i++) {
//            nums[i] = scan.nextInt();
//        }
//
//        //WRITE YOUR CODE BELOW
//
//     int secondNumber=nums[1];
//        System.out.println("Second element: " + secondNumber);
//        int secondLasNum=nums[nums.length-2];
//        System.out.println("Second to last element: " + secondLasNum);
        Scanner scan = new Scanner(System.in);
//        double[] temps = { scan.nextDouble(), scan.nextDouble(), scan.nextDouble(), scan.nextDouble(),
//                scan.nextDouble(), scan.nextDouble(), scan.nextDouble() , scan.nextDouble()  };
  int size =  scan.nextInt();
        double[] temps = new double[size];

        for (double i = 0, j = scan.nextDouble(); i < size; i++) {
           scan.nextDouble();
            temps[(int) i] = j;
        }
        System.out.println("temps = " + Arrays.toString(temps));

    }
//String a="ber";
//String c="bere";
//String d="e";
//String f="j";
//        System.out.println(a.compareTo(c));
}



