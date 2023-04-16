package daily_lessons.day_06_if_intro;

public class EvenlyDivisible {
    public static void main(String[] args) {
        int number = 65;

        boolean isDivisebleBy2= number%2==0 ;
        boolean isDivisebleBy3= number%3==0 ;
        boolean isDivisebleBy5= number%5==0;

        System.out.println(number +" is by 2 EvenlyDiviseble = " + isDivisebleBy2);
        System.out.println(number +" is by 3 EvenlyDiviseble = " + isDivisebleBy3);
        System.out.println(number +" is by 5 EvenlyDiviseble = " + isDivisebleBy5);

    }
}
