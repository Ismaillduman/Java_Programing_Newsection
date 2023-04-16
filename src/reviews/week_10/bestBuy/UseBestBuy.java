package reviews.week_10.bestBuy;

import java.text.DecimalFormat;

public class UseBestBuy {
    public static void main(String[] args) {

        BestBuy bestBuy= new BestBuy("köln",111,40);
        System.out.println(bestBuy.reportProfits());
        System.out.println(bestBuy);
        bestBuy.setAddress("france paris");
        System.out.println(bestBuy);
    }
}
