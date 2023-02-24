package day_08;

public class TernariesIntro3 {
    public static void main(String[] args) {

        int score=50;

        String result;

        result= (score>=0&&score<=100) ?
                (score>=60) ? "passed":"failed": "invalid score";

        System.out.println(result);
    }
}
