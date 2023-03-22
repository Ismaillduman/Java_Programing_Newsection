package day_06_if_intro;

public class NumberOfDays {
    public static void main(String[] args) {

        int month= 13;
        String result="";
        //boolean has31Days= month==1||month==3||month==5||month==7||month==8||month==10||month==12;
        boolean has30Days= month==4||month==6||month==9||month==11;
        boolean has31Days= !has30Days && month>0&&month<=12;

        if(has31Days){
            result=". month has 31 Days";
        } else if (has30Days) {
            result=". month has 30 Days";
        } else if (month==2) {
            result=". month has 28 Days";
        }

        else {
           result=" is invalid. A year has not " +month+" month";

        }System.out.println(month+result);

    }
}
