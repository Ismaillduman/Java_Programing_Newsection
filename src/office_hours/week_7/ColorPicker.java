package office_hours.week_7;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

import static com.sun.jndi.toolkit.dir.DirSearch.search;

public class ColorPicker {
    public static void main(String[] args) {
        /*
T1ColorPicker [loop, Scanner, String]
    Create a program that will allow the user to select three unique colors.
    Ask the user to enter their colors one at a time. Verify the color hasn't been selected already. If the color is unique add it to the final selection otherwise tell the user the colors should be unique and allow them to reenter a different color. The number of iterations is not fixed
    Ex flow:
        Enter color 1:
            > red
        red added
        Enter color 2:
            > red
        red is already selected
        Enter color 2:
            > green
        green added
        Enter color 3:
            > red
        red is already selected
        Enter color 3:
            > green
        green is already selected
        Enter color 3:
            > orange
        orange added
        Here are the colors you picked: red, green, orange
     */
        Scanner sc= new Scanner(System.in);

       String [] colors= new String[3];
        for (int i = 0; i < colors.length; i++) {
            System.out.println("Enter a color");
            String color=sc.nextLine();
            if(search(colors,color)==0){
                colors[i]=color;
            }else{
                System.out.println("It has been entered.");
                i--;
            }
        }

        System.out.println(Arrays.toString(colors));
/*int[] list = new int[5];

for (int i = 0; i < list.length; i++) {
    System.out.println("Enter number: ");
    int temp = input.nextInt();
    if(search(list,temp) == 0)
        list[i] = temp;
    }else{
        System.out.println("It has been entered.");
        i--;
    }
}*/

    }

    private static int search(String[] colors, String color) {


            int count = 0;
        for (String s : colors) {
            if (Objects.equals(s, color)) {
                count++;
            }
        }
            return count;
        }
    }

