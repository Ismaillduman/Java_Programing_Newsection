package reviews.review_07;

import java.util.Scanner;

public class Months {
    public static void main(String[] args) {
        String[] months = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sept", "Oct", "Nov", "Dec"};

        int montNum;
        String result = "";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your month number");
        montNum = sc.nextInt();


        while (!(montNum >0 && montNum < 12)) {
            System.err.println("Please enter a valid month number");
            montNum=sc.nextInt();

        }


            for (int i = montNum; i <= months.length; i++) {
                System.out.println(months[montNum]);
                break;
            }
        sc.close();


    }}
