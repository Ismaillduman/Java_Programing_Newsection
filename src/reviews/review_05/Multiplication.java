package reviews.review_05;

public class Multiplication {
    public static void main(String[] args) {
       multi(9);
        System.out.println("=========================================");
       multi(5,5);
    }

    public static int multi(int num ){
        int result=0;
        for(int i =0;i<=10;i++){
            result=num*i;
            System.out.println(num+" x "+i+"= "+result);
        }
        return result;
    }
    public static int multi(int num,int factor ){
        int result=0;
        for(int j=1;j<=num;j++) {

            for (int i = 0; i <= factor; i++) {
                result = j * i;
                System.out.println(j + " x " + i + "= " + result);

            }
            System.out.print("");
        }
        return result;
    }
}
