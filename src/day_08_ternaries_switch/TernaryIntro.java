package day_08_ternaries_switch;

public class TernaryIntro {
    public static void main(String[] args) {
        int score=85;

        String result;

        result=(score>60&&score<101) ? "passed":"failed";
        System.out.println("result = " + result);

        int age=34;

        String str;

        str= (age>=21)? "Elligeble": "Not Elligible";

        System.out.println(str);

    }
}
