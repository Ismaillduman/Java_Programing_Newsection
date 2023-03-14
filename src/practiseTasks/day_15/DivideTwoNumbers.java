package practiseTasks.day_15;

public class DivideTwoNumbers {
    public static void main(String[] args) {
        int num1=140;
        int num2=5;
        int result=1;
        int division=0;

        for (int i = 0; i <Integer.MAX_VALUE; i+=num2) {
            if(!(result ==0)){
                result=num1-i;
                division+=1;
            }
            if(result==0){
                break;
            }

        }
        System.out.println("division = " + (division-1));
        int count=0;
        while (num1>=num2){
            num1-=num2;
            count+=1;
        }
        System.out.println(count);
    }
}
