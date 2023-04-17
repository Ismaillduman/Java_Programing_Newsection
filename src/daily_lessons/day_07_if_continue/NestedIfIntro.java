package daily_lessons.day_07_if_continue;

public class NestedIfIntro {
    public static void main(String[] args) {
        int score = 59;
        String result;
        if (score <= 100 && score >= 0) {
            result="";
            if (score >= 60) {
                result = "Passed";
            } else if (score < 60) {
                result = "Failed";
            }
        }else{
            result="undefined";
           }
        System.out.println(result);

    }
}
