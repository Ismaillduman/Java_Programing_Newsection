package day_08;

public class TernaryIntro_2 {
    public static void main(String[] args) {

        int num=100;
        String result="";

        result=(num>0)?"positiv":(num<0)?"negativ":"zero";

        System.out.println("result = " + result);
        System.out.println("--------------------------------\n");
        String day="";
        int n=7;

        day= (n>0&&n<=7)?(n==1)? "monday" :(n==2) ? "tuesday" :(n==3) ? "wednesday"
                :(n==4) ? "thursday" :(n==5) ? "friday" :
                (n==6) ? "saturday" :  "sunday" : "no such a day";

        System.out.println(n + " .day = " + day);

        System.out.println("-----------------------\n");






    }
}
