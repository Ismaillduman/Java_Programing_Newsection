package daily_lessons.day_06_if_intro;

public class MaximumNumber {
    public static void main(String[] args) {
    int num3;
        int num2;
        num3=15;
        num2=122;
        if(num3<num2){
            System.out.println(num2+ " is greater than "+ num3);
        } else if (num3>num2) {
            System.out.println(num3+ " is greater than "+ num2);
        }else {
            System.out.println(num3 +" equal "+ num2);
        }
    }
}


