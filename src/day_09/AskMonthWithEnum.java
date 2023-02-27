package day_09;

enum Months{
    FEBRUARY,JANUARY,MARCH,APRIL,JUNE,JULY,AUGUST,SEPTEMBER,OCTOBER,NOVEMBER,DECEMBER,MAY
}
public class AskMonthWithEnum {
    public static void main(String[] args) {
        Months myMonth = Months.FEBRUARY;
        //Scanner sc =new Scanner(System.in);
        //System.out.println("Enter youts favorite months number");
        //int month= sc.nextInt();
        String result = "invalid month";
        //if (month > 0 && month < 13) {
        switch (myMonth) {
            case JANUARY:
            case MARCH:
            case MAY:
            case JULY:
            case AUGUST:
            case OCTOBER:
            case DECEMBER:
                result = myMonth.name() + " that has 31 days";
                break;
            case APRIL:
            case JUNE:
            case NOVEMBER:
            case SEPTEMBER:
                result = myMonth + " that has 30 days";
                break;
            default:
                result = myMonth.JANUARY + " has 28 days";
        }

        System.out.println("result = " + result);
    }
}
