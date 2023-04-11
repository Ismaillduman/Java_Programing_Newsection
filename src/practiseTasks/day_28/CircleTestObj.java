package practiseTasks.day_28;

public class CircleTestObj {
    public static void main(String[] args) {
        Circle circle= new Circle(6);
        circle.setRadius(8);
        System.out.println(circle);
        System.out.println("circle.calcArea() = " + circle.calcArea());
    }
}
