package practiseTasks.day_14;

import java.util.Scanner;

public class Finra {

        /*
2. Write a method which prints out the numbers from 1 to 100 but for numbers which are a multiple of both 3 and 5,
print "FINRA" instead of the number,  for numbers which are a multiple of 3,
print "FIN" instead of the number and for numbers which are a multiple of 5, print "RA" instead of the number.

    ex:
        output:
            1 2 FIN 4 RA FIN 7 8 FIN RA 11 FIN 13 14 FINRA 16 17 FIN*/

    public static void main(String[] args) {
        for (int i = 1; i < 100; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.print(" FINRA ");
                } else if (i % 5 == 0) {
                    System.out.print(" RA ");
                } else {
                    System.out.print(" FIN ");
                }
            } else {
                System.out.print(i + " ");
            }
        }

    }}
//        Scanner console = new Scanner(System.in);
//        int totalNumbers = console.nextInt();
//        int minMax = 0;
//        int smallest = 0;
//        int largest = -999999999;
//
//
//        for(int i = 1; i <= totalNumbers; i++){
//            System.out.print("Number " + i + ": ");
//            int inputNumbers = console.nextInt();
//            if(inputNumbers > largest){
//                largest = inputNumbers;
//            } else if (inputNumbers < smallest){
//                smallest = inputNumbers;
//            }
//        }
//        System.out.println();
//
//        System.out.println("Smallest = " + smallest);
//        System.out.println("Largest = " + largest);
//    }
//}
//        public static void main(String[] args) {
//            // initialization of variables
//            int size;
//            Scanner scan = new Scanner(System.in);
//            int smallest = Integer.MAX_VALUE;
//            int largest = Integer.MIN_VALUE;
//
//            System.out.println("Enter an array size.");
//            size = scan.nextInt();
//
//            int[] numbers = new int[size];
//
//            System.out.println("Enter each integer in the array and press Enter after each one.");
//
//            for (int i = 0; i < size; i++) {
//                numbers[i] = scan.nextInt();
//            }
//
//            scan.close();
//
//            for (int j = 0; j < size; j++) {
//
//                if (numbers[j] < smallest) {
//                    smallest = numbers[j];
//                } if (numbers[j] > largest) {
//                    largest = numbers[j];
//                }
//            }
//
//            System.out.println("Smallest Number is " + smallest);
//            System.out.println("largest = " + largest);

