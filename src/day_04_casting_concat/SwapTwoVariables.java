package day_04_casting_concat;

public class SwapTwoVariables {
    public static void main(String[] args) {
        /*Create a class named SwapTwoVariables1 and declare the following variables:
            x
            y
            z

    8.1 Write a program that swap variables x & y’ values by using a temporary variable z
        Ex:
              x = 10
              y = 15

        output:
                  x = 15
                  y = 10
*/
        int x, y, z;

        x = 10;
        y = 15;

        z=x;
        x=y;
        y=z;


        System.out.println("x = " + x);
        System.out.println("y = " + y);


    }
}
