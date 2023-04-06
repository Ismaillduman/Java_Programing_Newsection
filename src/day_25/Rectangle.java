package day_25;

public class Rectangle {
    public double length,width;
    public double area(){
        return length*width;
    }

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

//    public void setInfo(double length, double width) {
//        this.length = length;
//        this.width = width;
//    }

    public Rectangle(){

    }


    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                ", area=" + area() +
                '}';
    }


}
