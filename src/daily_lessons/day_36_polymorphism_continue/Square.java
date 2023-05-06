package daily_lessons.day_36_polymorphism_continue;

public class Square {
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
public double area(){
        return side*side;
}
public double perimeter(){
        return 4*side;
}
    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                "area=" + area() +
                "perimeter=" + perimeter() +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof Square)){
            System.err.println("Invalid object");
            System.exit(1);
        }if(side==((Square)obj).side){
            return true;
        }
        return false;
    }
}
