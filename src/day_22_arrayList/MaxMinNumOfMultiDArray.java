package day_22_arrayList;

public class MaxMinNumOfMultiDArray {
    public static void main(String[] args) {
        int[][] array= {{100,20,300},{10,1000,50},{-200,400,0}};
        int maxi=array[0][0];
        int mini=array[0][0];
       // int maxi=Integer.MIN_VALUE;
        //int mini=Integer.MAX_VALUE;

        for (int[] nums : array) {
            for (int num : nums) {
                if(num>maxi){
                    maxi=num;
                }
                if(num<mini){
                    mini=num;
                }

            }
        }
        System.out.println(maxi);
        System.out.println("mini = " + mini);
//        for (int[] nums : array) {
//            for (int num : nums) {
//                if(num<mini){
//                    mini=num;
//                }
//            }
//        }
//        System.out.println("mini = " + mini);
    }
}
