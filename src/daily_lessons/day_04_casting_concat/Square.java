package daily_lessons.day_04_casting_concat;

public class Square {
    public static void main(String[] args) {
        /* Create a class named Square and declare the following variables:
                side
                area
                perimeter

    5.1 Write a program that can calculate the area and perimeter of a square with any given  side
        Ex:
              side = 5

        output:
               Area of the square is 25
               Perimeter of the square is 20
*/

        double side, area, perimeter;
        side=5;
        area = side*side;
        perimeter=side*4;

        System.out.println("Area of the square is "+ area+ "\n"+"Perimeter of the square is "+ perimeter);
    }
}
