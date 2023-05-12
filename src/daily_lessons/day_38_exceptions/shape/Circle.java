package daily_lessons.day_38_exceptions.shape;

public class Circle extends InvalidShapeException{
private double radius;

    public Circle(String message, double radius) {
        super(message);
        setRadius(radius);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
