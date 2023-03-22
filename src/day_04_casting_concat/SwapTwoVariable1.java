package day_04_casting_concat;

public class SwapTwoVariable1 {
    public static void main(String[] args) {
        /* Create a class named SwapTwoVariable21 and declare the following variables:
            x
            y

    9.1 Write a program that swap variables x & y’ values without using any temporary variables
        Ex:
              x = 10
              y = 15

        output:
                  x = 15
                  y = 10
*/

        int x, y;

        x = 10;
        y = 15;

        x = x + y; //x =25
        y = x - y; //y = 10
        x = x - y; //x =15
        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }
}
