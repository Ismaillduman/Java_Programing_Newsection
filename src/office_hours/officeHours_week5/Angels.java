package office_hours.officeHours_week5;

import java.util.Scanner;

public class Angels {
    public static void main(String[] args) {
        /*Create a program that will ask the user to enter 3 angles.
	Add to sum of the angles and print what type of shape is made from the angles.
		If the angles add up to 180 print triangle.
		If the angles add up to 360 print circle
		For any other angle print: Cannot determine
*/

        Scanner sc=new Scanner(System.in);
        System.out.println("enter first Angle");
        int firstAngle=sc.nextInt();
        System.out.println("enter second Angle");
        int secondAngel=sc.nextInt();
        System.out.println("enter third Angle");
        int thirdAngle=sc.nextInt();
        int sumOfAngles= firstAngle+secondAngel+thirdAngle;



        if(sumOfAngles==180){
            System.out.println("triangle");
            return;
        }
        String circle = sumOfAngles == 360 ? "circle" : "can not determin";
        System.out.println(circle);

    }
}
