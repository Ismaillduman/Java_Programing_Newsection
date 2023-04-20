package daily_lessons.day_31.shape;

public class Circle extends Shape{
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI*radius*radius;
    }

    @Override
    public double perimeter() {
        return 2*Math.PI*radius;
    }

    @Override
    public void draw() {
       super.draw();
    }

    @Override
    public String toString() {
        return getClass().getSimpleName()+"{" +
                "name='" + getName()+ '\'' +
                "radius='" + radius+ '\'' +
                "area='" + area() + '\'' +
                "perimeter='" + perimeter() + '\'' +
                '}';
    }
}
