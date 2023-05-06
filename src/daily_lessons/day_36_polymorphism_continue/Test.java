package daily_lessons.day_36_polymorphism_continue;

import jdk.swing.interop.SwingInterOpUtils;

public class Test {
    public static void main(String[] args) {
        Circle circle1= new Circle(5);
        Circle circle2= new Circle(3);
        Circle circle3= new Circle(5);
        System.out.println(circle3==circle1); //false
        System.out.println(circle3.equals(circle1));//true

        System.out.println("--------------------------------------------------------");
        ApplePhone applePhone= new ApplePhone( "Iphone 12", "Medium", "Black", 900);
        ApplePhone applePhone2= new ApplePhone( "Iphone 12", "Medium", "White", 900);

        System.out.println(applePhone2.equals(applePhone));
    }
}
