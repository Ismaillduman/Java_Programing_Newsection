package day_06_if_intro;

public class Cigarettes {
    public static void main(String[] args) {
        int age= 100;

        boolean isEligible= age>=18 && age<100;

        if (isEligible){
            System.out.println("You are eligible to buy Cigarettes");
        }else{
            System.out.println("You are not eligible to buy Cigarettes");
        }
    }
}
