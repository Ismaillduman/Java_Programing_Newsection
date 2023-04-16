package daily_lessons.day_15_loops_continue;

public class SumOfEvenNum {
    public static void main(String[] args) {
        System.out.println(sumEven());
        sumEven(101);
    }

    public static  int sumEven(){

        int sum=0;
        for(int i=50;i<101;i++){

            if(i%2!=0){
                continue;

            }
            sum+=i;
        }

        return sum;
    }

    public static void sumEven(int n){


        int result=0;
        for (int i = 50; i < n; i+=2) {
            result+=i;
        }
        System.out.println(result);
    }
}
