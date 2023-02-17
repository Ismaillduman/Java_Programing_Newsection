package day_06;

public class MedianNumber {
    public static void main(String[] args) {
        /* Create a class named MedianNumber. write a program
        that can find the median number between three DIFFERENT given integers

		Ex:
                a = 10, b= 15, c = 20;

            Output:
                15 is the median number*/

        int a= 180;
        int b= 35;
        int c= 120;
        int median = 0;


        if(a<b && c>a){
            if(b>c){
             median = c;
            }
            else{median=b;
        }

        }

        if(b<a && c>b){
            if(a>c){
                median =c;
            }
            else{
                median=a;
            }

        }

        System.out.println("median number is "+median);


}
    }
