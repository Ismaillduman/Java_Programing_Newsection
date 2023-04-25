package office_hours.week_12.season;

public class CheckSeason {
    public static void main(String[] args) {
        Fall fall= new Fall(14,6);
        Summer summer= new Summer(28,16);
        Spring spring= new Spring(19,14);
        Winter winter= new Winter(12,0);
        System.out.println("fall = " + fall);
        System.out.println("summer = " + summer);
        System.out.println("winter = " + winter);
        System.out.println("spring = " + spring);

        fall.activity();
        winter.activity();
        summer.activity();
        spring.activity();
        /* Create a class CheckSeason

        create an object of Winter, Summer, Fall and Spring and verify if the constructor,
        toString(), and activity() are working properly for each class*/
    }
}
