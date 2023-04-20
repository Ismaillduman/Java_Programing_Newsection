package daily_lessons.day_31.shape;

public class Square extends Shape {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double area() {
        return side*side;
    }

    @Override
    public double perimeter() {
        return side*4;
    }

    @Override
    public void draw() {
        System.out.println("* * * * *");
        for (int i = 0; i < 3; i++) {
            System.out.println("*       *");
        }
        System.out.println("* * * * *");
    }
}
