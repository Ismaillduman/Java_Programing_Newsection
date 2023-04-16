package daily_lessons.day_19_arrays_intro;

import java.text.DecimalFormat;

public class DecimalNumberPractice {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0.00");

        double n = 0.12954687899;
        System.out.println("n = " + df.format(n));
    }
}
