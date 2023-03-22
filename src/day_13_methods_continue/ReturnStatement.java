package day_13_methods_continue;

public class ReturnStatement {
    public static void main(String[] args) {
        System.out.println("test 1 started");

        boolean exit=true;
        if(exit){
            return;//main methods gets terminated in void method return statement have any value
        }
        System.out.println("Test completed");
        System.out.println("test 2 started");
    }
}
