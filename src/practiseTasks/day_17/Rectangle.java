package practiseTasks.day_17;

public class Rectangle {
    /*create a custom class named Rectangle
		Attributes:
		    length, width

		Actions:
		    setInfo(): sets the length and width of the rectangle object
		    calculateArea(): calculates the area of the rectangle, returns it as double
		    calculatePerimeter() calculates the perimeter of the rectangle, returns it as double
		    toString(): when a rectangle object is passed in print statement
		    		it should display the length, width, area and perimeter of the Rectangle object*/

    double length;
    double width;

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double calculateArea(int length,int width){
        double area;
        area=length*width;
        System.out.println("area = " + area);
        return area;
    }

    public double calculatePerimeter(int length,int width){
        double perimeter;
        perimeter=2*width+length*2;
        System.out.println("perimeter = " + perimeter);
        return  perimeter;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +

                '}';
    }
}
