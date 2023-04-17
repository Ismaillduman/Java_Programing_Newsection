package daily_lessons.day_15_loops_continue;

import java.util.Scanner;

public class CalculatorWitWhileLoop {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        String answer= "yes";
        while(answer.equalsIgnoreCase("yes")) {
            System.out.println("Enter your first number");
            int n1 = sc.nextInt();

            System.out.println("Enter your second number");
            int n2 = sc.nextInt();

            System.out.println("Enter a valid operator");
            char operator = sc.next().charAt(0);

            while (!(operator == '+' || operator == '*' || operator == '-' || operator == '/')) {
                System.err.println("invalid operator please enter a valid operator");
                operator = sc.next().charAt(0);

            }
           // sc.close();
            double result = 0;
            switch (operator) {
                case '+':
                    result = n1 + n2;
                    break;
                case '-':
                    result = n1 - n2;
                    break;
                case '*':
                    result = n1 * n2;
                    break;
                case '/':
                    result = n1 / n2;
                    break;
            }

            System.out.println("result = " + result);

            System.out.println("Would you like to continue Yes/no");
            answer=sc.next();

            while(!(answer.equalsIgnoreCase("yes")||answer.equalsIgnoreCase("no"))){
                System.err.println("Enter a valid answer yes/no");
                answer=sc.next();
            }

        }
    }
}
