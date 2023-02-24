package practiseTasks;

public class Calculator {
    public static void main(String[] args) {
        double n1=12.4;
        double n2=2.2;
        char operator='+';
        String result;

        result = (operator=='+') ? String.valueOf((n1 + n2)) : (operator=='-') ? String.valueOf((n1-n2)) : (operator=='/') ? String.valueOf((n1/n2)) :
                (operator=='*')? String.valueOf((n1*n2)) : "enter valid operator";

        System.out.println("result = " + result);
    }
}
