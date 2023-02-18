package day_06;

public class Calculator {
    public static void main(String[] args) {

      double n= 10;
        double n2= 20;
        char mathOperator= '/';
        double result= 0.0;

        if(mathOperator=='+'){

            result= n + n2;
        } else if (mathOperator== '-') {
            result= n - n2;
        } else if (mathOperator== '*') {
            result= n * n2;
        } else if (mathOperator== '/') {
            result= n / n2;
        }
        System.out.println(result);
    }
}
