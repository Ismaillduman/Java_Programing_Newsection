package day_15;

import java.util.Scanner;

public class WhileLoop {

    public static void main(String[] args) {
//        int number= 0;
//        while(number<=5){
//            System.out.println("hello");
//            number++;
//        }

        eligible();
    }

    public static void eligible(){

        Scanner sc= new Scanner(System.in);

        System.out.println("enter your age");
        int age =sc.nextInt();

        while(age>=150||age<=1){
            System.err.println("invalid entry please re-enter your age ");
            age=sc.nextInt();


        }

        if(age>=21){
            System.out.println("eligible");
        }else{
            System.out.println("Not eligible");
        }
        sc.close();
    }
}
