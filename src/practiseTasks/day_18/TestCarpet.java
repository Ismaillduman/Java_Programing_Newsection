package practiseTasks.day_18;

import java.text.DecimalFormat;

public class TestCarpet {
    public static void main(String[] args) {

        Carpet carpet = new Carpet();
        DecimalFormat df = new DecimalFormat("0.00");

        carpet.setInfo(3,2,25.6,true);
        System.out.println("carpet Cost = " + df.format(carpet.calcCost()));

        System.out.println("carpet = " + carpet);
    }
}
