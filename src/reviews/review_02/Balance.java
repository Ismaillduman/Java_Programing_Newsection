package reviews.review_02;

public class Balance {
    public static void main(String[] args) {
        double balance=1000;
        double withDrawAmount= 1200;
        balance-=withDrawAmount;

        if ((balance - withDrawAmount)<0) {
            System.out.println("you can not withdraw money. Overdraft applied");
            balance+=(balance*0.2);
        }

        System.out.println("balance = " + balance);

    }
}
