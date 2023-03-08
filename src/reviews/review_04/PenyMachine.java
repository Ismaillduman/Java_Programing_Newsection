package reviews.review_04;

import java.util.Scanner;

public class PenyMachine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your cents Amount");
        int cent= sc.nextInt();
        int quarters,dimes,nickel,dollar,penny;
        String result=cent+" was converted to ";
if(cent>0&&cent<1200){
    dollar= cent/100;
    cent%=100;
  result+=dollar>0 ? dollar+" dollars, ":"";

    quarters = cent/25;
    cent%=25;
    result+=quarters>0? quarters+" quarters, ":"";

    dimes=cent/10;
    cent%=10;
    result+=dimes>0? dimes+" dimes, ":"";

    nickel=cent/5;
    cent%=5;
    result+=nickel>0 ? nickel+" nickel, ":"";

    result+=cent>0 ?cent+" pennies":"";

    System.out.println(result);

}else{
    System.out.println("Sorry we cannot process your request");
}






 /*A penny is worth 1 cent.
A nickel is worth 5 cents.
A dime is worth 10 cents.
A quarter is worth 25 cents.*/




    }
}
