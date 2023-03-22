package day_05_operators;

public class ShorthandOperators {
    public static void main(String[] args) {
        int a = 20;

        System.out.println("a = " + a); //20

        a=40 ;
        System.out.println("a = " + a); //40


        System.out.println("__________________________________________________________");

        double balance = 1000;

        balance += 200;

        System.out.println("balance = " + balance); //1200

        balance-=560;

        System.out.println("balance = " + balance); //1200 - 560 = 640

        System.out.println("_-------------------------------------------------");

        double salary= 2500;

        salary*=3;

        System.out.println("new salary $"+salary);


        double spend;

        spend= salary/40;

        spend*=2;

        System.out.println("new spend amount $"+spend);

        System.out.println("---------------------------------------------");

        int num=12568;

        num%=10;

        System.out.println("num remainder"+num);


    }
}
