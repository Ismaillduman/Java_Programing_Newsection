package practiseTasks.day_17;

import java.text.DecimalFormat;

public class TestRectangle {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0.00");
        Rectangle rectangle = new Rectangle();

        rectangle.calculateArea(5, 2);
        rectangle.calculatePerimeter(4, 9);
        rectangle.width = 4;
        rectangle.length = 2;
        System.out.println(rectangle);


    }
}
