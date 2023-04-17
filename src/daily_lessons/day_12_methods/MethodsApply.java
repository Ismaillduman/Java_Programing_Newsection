package daily_lessons.day_12_methods;

import java.util.Scanner;

public class MethodsApply {

    public static void main(String[] args) {
        //CustomMethods mymethod = new CustomMethods();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter yours numbers and operator");
        int a = sc.nextInt(),
                b = sc.nextInt();
        char operator = sc.next().charAt(0);
        CustomMethods.calculator(a, b, operator);

        CustomMethods.oddOrEven(49);

        CustomMethods.initialsOfPerson("ismail", "duman");

        CustomMethods.maxNumber(45, 89);

    }
}
