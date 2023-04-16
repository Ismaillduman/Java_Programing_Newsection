package daily_lessons.day_12_methods;

public class CustomMethods {

    public static int calculator(int a, int b, char operator) {

        int result = 2;
        switch (operator) {
            case '+':
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;
            case '*':
                result = a * b;
                break;
            case '/':
                result = a / b;
                break;
            default:
                System.out.println("invalid operator");


        }


        System.out.println("result = " + result);

        return result;


    }

    public static int oddOrEven(int d) {
        if (d % 2 == 0) {
            System.out.println("even number");
        } else {
            System.out.println("odd number");
        }
        return d;
    }

    public static void initialsOfPerson(String firstName, String lastName) {

        String initials = "";

        initials = firstName.charAt(0)+"."+lastName.charAt(0);

        System.out.println("initials = " + initials);



    }


    public static void maxNumber(int a, int b){


        if(a>b){
            System.out.println(a +" is bigger than "+b);
        } else if (a<b) {
            System.out.println(b +" is bigger than "+a);
        }else{
            System.out.println(a+" equals "+b);
        }

    }
}