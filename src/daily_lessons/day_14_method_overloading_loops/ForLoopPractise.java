package daily_lessons.day_14_method_overloading_loops;

public class ForLoopPractise {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i <= 100; i++) {
            sum += i;
        }
        System.out.println(sum);


        for(char i='A';i<='Z';i++){
            System.out.print(i+" ");
        }
        System.out.println();

        for(char i='Z';i>='A';i--){
            System.out.print(i+" ");
        }
    }
}
