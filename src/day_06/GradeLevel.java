package day_06;

public class GradeLevel {
    public static void main(String[] args) {

        int gradeLevel=11;
        String result="";

        if(gradeLevel<=5 && gradeLevel>=1){
           result= " grade level is Elementary school";
        }else if(gradeLevel>=6 && gradeLevel<=8){
            result= " grade level is Middle School";
        }else if(gradeLevel<=12 && gradeLevel>=9){
           result= " grade level is High School";
        }else if(gradeLevel>=13 && gradeLevel<=16){
            result= " grade level is College";
        }else if(gradeLevel<=18 && gradeLevel>=17){
            result= " grade level is Grad School";
        }else{
            result= " is not define please enter the valid grade";
        }
        System.out.println(gradeLevel+result);
    }
}
