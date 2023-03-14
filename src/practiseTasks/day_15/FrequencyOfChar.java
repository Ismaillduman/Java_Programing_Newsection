package practiseTasks.day_15;

import java.util.Scanner;

public class FrequencyOfChar {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int count=0;
        System.out.println("Enter your str");
        String str=sc.nextLine();
        System.out.println("Which char's frequency do you want to learn ");
        char ch=sc.nextLine().charAt(0);

        for (int i = 0; i <str.length() ; i++) {
            if(str.toLowerCase().charAt(i)==ch){
                count+=1;
            }
        }
        System.out.println(count);
    }
}
