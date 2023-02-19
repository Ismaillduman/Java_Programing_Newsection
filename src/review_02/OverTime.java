package review_02;

public class OverTime {
    public static void main(String[] args) {
        double hourly_rate= 50.0;
        int hours= 46;
        double netPay;
        String message = "";
        int overtimeHours= hours-40;

        if (hours>40) {
            netPay=40*hourly_rate +  overtimeHours*hourly_rate*1.5;
                    message="You worked "+hours + " hours so you will get "+overtimeHours+" hours of overtime. " +
                            "Your netpay is: $"+netPay;
        }else{
            //worked than less 40 hours

            netPay= hours*hourly_rate;
            message="You worked "+hours + " hours so your total netpay is: $"+netPay;
        }
        System.out.println(message);


    }
}
