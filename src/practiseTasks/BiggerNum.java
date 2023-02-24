package practiseTasks;

public class BiggerNum {
    public static void main(String[] args) {

        int a=1000;
        int b=20;
        int c=3000;int biggerNum;

        biggerNum = (a>b)?(a>c ? a:c):(b>c? b:c);
        System.out.println("biggerNum = " + biggerNum);
    }
}
