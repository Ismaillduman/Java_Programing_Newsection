package day_06;

public class MedianNumber {
    public static void main(String[] args) {
        /* Create a class named MedianNumber. write a program
        that can find the median number between three DIFFERENT given integers

		Ex:
                a = 10, b= 15, c = 20;

            Output:
                15 is the median number*/

        int a= 18;
        int b= 15;
        int c= 20;

        if(a<b && c>a){
            if(b>c){
                System.out.println(c + " is the median number");
            }
            else{System.out.println(b + " is the median number");
        }

        }

        if(b<a && c>b){
            if(a>c){
                System.out.println(c + " is the median number");
            }
            else{System.out.println(a+ " is the median number");
            }

        }
        if(c<b && b>a){
            if(a>c){
                System.out.println(c + " is the median number");
            }
            else{System.out.println(a + " is the median number");
            }

        }


}
    }
