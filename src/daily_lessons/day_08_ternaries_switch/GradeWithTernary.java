package daily_lessons.day_08_ternaries_switch;

public class GradeWithTernary {
    public static void main(String[] args) {
        int score=-10;
        String grade="A";
if(score <= 100 && score >= 0) {
    grade = (score>=90) ? "A" : (score>=80) ? "B" :(score>=70) ? "C" :
            (score>=60) ? "D" : "F";
}else{
    grade ="no such a grade";
}
        System.out.println("grade = " + grade);
    }

    public static class FINRA {
        public static void main(String[] args) {
            String result = "That's not a whole number";
           double number = 15.6;
           boolean by3= number%3==0;
           boolean by5= number%5==0;

            if (number%1==0) {
                if (by3) {
                    if (by5) {
                        result = "FINRA";
                    } else {
                        result = "FIN";
                    }

                } else if (by5) {
                    result = "RA";
                } else {
                    result = "Learn more about mathe";
                }

            }
            System.out.println("Result = " + result);
        }
    }
}
