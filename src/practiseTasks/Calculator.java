package practiseTasks;

public class Calculator {
    public static void main(String[] args) {
        double n1=12.4;
        double n2=2.2;
        char operator='+';
        String result;
        double transactionResult=0.0;

        result = (operator=='+') ? String.valueOf((n1 + n2)) : (operator=='-') ? String.valueOf((n1-n2)) : (operator=='/') ? String.valueOf((n1/n2)) :
                (operator=='*')? String.valueOf((n1*n2)) : "enter valid operator";

        System.out.println("result = " + result);

        switch(operator){
            case '+':
                transactionResult= n1+n2;
                break;
            case '/':
                transactionResult= n1/n2;
                break;
            case '-':
                transactionResult=n1-n2;
                break;
            case '*':
                transactionResult=n1*n2;
                break;
            default:
                System.out.println("enter valid operator");

        }
        System.out.println("transactionResult = " + transactionResult);
    }
}
