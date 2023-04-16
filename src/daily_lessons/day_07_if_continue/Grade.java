package daily_lessons.day_07_if_continue;

public class Grade {
    public static void main(String[] args) {
        char grade = 'k';
        String result;

        if (grade == 'B') {
            result = "Great Job";
        } else if (grade == 'A') {
            result = "Excellent";
        } else if (grade == 'C') {
            result = "Good";
        } else if (grade == 'D') {
            result = "Passed";
        } else if (grade == 'F') {
            result = "Failed";
        }else{result="Invalid variable";}
        System.out.println(result);

    }
}
