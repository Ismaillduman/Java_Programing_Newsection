package practiseTasks.day_1to_8;

public class GradeLevel {
    public static void main(String[] args) {
        byte grade = 123;
        String result ="";

        if (grade < 19 && grade > 0) {
            if (grade < 6 && grade > 0) {
                result = "Elementary school";
            } else if (grade < 9 && grade > 5) {
                result = "Middle School";
            } else if (grade < 13 && grade > 8) {
                result = "High School";
            } else if (grade < 17 && grade > 12) {
                result = "College";
            } else if (grade > 16 && grade < 19) {
                result = "Grad School";
            }
        } else {
            result = "invalid grade level given";
        }
        System.out.println("result = " + result);

    }
}
