package practiseTasks.day_19;

import java.util.Arrays;
import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {
        /*4. given the following arrays:
		     	String [] names = {"Anna", "Nancy", "Sarah"};
		        int [] scores = {90, 75, 80};
		        char [] grades = new char[names.length];

         1. write a program that can store the grades of the students in the array named grades
         2. print the grade report of each students in separate lines
         		Ex:
         			Anna's score is 90, and grade is A*/
        String [] names = {"Anna", "Nancy", "Sarah"};
        int [] scores = {90, 75, 80};
        char [] grades = new char[names.length];
        Scanner sc =new Scanner(System.in);

        System.out.println("How many student's grade want to enter");
        int size = sc.nextInt();
        for (int i = 0; i <size ; i++) {
            System.out.println("Enter grades");
            char grade=sc.next().charAt(0);
            grades[i]=grade;
            System.out.println(names[i]+"'s score is "+scores[i]+", and grade is "+grades[i]);
        }
        System.out.println(Arrays.toString(grades));


    }
}
