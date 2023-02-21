package day_07;

public class LoanApplication {
    public static void main(String[] args) {
        int salary=55000,
        creditScore=780;
        String result;

        if(salary>45000&&creditScore>700){
            result="eligible to loan";
        }else{
           result="not eligible to take loan";
    }
        System.out.println(result);
    }
}
