package daily_lessons.day_31.shape;

public class Rectangle extends Shape {
    private double width,length;

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double area() {
        return width*length;
    }

    @Override
    public double perimeter() {
        return 2*(width+length);
    }

    @Override
    public void draw() {
        System.out.println("* * * *");
        for (int i = 0; i < 3; i++) {
            System.out.println("*     *");
        }
        System.out.println("* * * *");
    }
}
