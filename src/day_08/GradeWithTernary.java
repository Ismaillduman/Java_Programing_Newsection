package day_08;

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
}
