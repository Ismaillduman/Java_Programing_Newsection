package day_13;

public class ReturnMethod {
    public static void main(String[] args) {
        sum(1,8);
        int total=sum(8,9);
        eligible(52);
        multiplication(56,25);
    }
    public static int sum(int a, int b){


       int sum=a+b;
        System.out.println("sum = " + sum);
        return sum;
    }

    public static void eligible(int age){
        if(age>150||age<0){
            System.err.println("invalid age: "+age);
            return; //exit methods
        }
        if(age>=21){
            System.out.println("you are eligible to buy alcohol");
        }else{
            System.out.println("You are not eligible ");
        }

    }
    public static int multiplication(int n1,int n2){

        int result=n1*n2;
        System.out.println("result = " + result);
        return result;
    }
}
