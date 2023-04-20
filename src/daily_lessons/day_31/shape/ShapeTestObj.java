package daily_lessons.day_31.shape;

import java.text.DecimalFormat;

public class ShapeTestObj {
    public static void main(String[] args) {
        DecimalFormat df=new DecimalFormat("0.00");
        Square square= new Square(3);
        square.draw();
        System.out.println("---------------------------------------------");
        Circle circle=new Circle(3);
        System.out.println(circle);
        System.out.println(df.format(circle.area()));
        System.out.println(df.format(circle.perimeter()));
        System.out.println("---------------------------------------------");
        Rectangle rectangle= new Rectangle(4,6);
        System.out.println(rectangle.area());
        rectangle.draw();
    }
}
