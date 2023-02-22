package practiseTasks;

public class FINRA {
    public static void main(String[] args) {
        String result="";
        int number=7;

        if(number%3==0){
            if(number%5==0){
                result="FINRA";
            }else {result="FIN";}

        } else if (number%5==0) {
            result="RA";
        } else{result="Learn more about mathe";}
        System.out.println("Result = " + result);
    }
}
