package daily_lessons.day_36_polymorphism_continue;

public class Circle {
    private double radius;
    public  final  static double pi=Math.PI;

    public Circle(double radius) {
        setRadius(radius);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double area(){
        return pi*radius*radius;
    }
    public double perimeter(){
        return 2*pi*radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                "area=" + area() +
                "perimeter=" + perimeter() +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Circle)) {
            System.err.println("Invalid object");
            System.exit(1);
        }
        if(this.radius== ((Circle)obj).radius){
            return true;
        }
        return false;
    }
}
