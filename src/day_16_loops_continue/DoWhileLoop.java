package day_16_loops_continue;

public class DoWhileLoop {
    public static void main(String[] args) {
        boolean condition=false;

        for (;condition;) {
            System.out.println("Hello Cydeo");
        }

        while(condition){
            System.out.println("Hello Cydeo");
        }

        do{
            System.out.println("Hello Cydeo  --dowhileloop");
        }while (condition);
    }
}
