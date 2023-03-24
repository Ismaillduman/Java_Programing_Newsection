package day_20;

public class ForEachLoop {
    public static void main(String[] args) {
        int [] numbers= {1,2,5,4,7,8,85};

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]+" ");
        }
        System.out.println("--------------------------------------------------");
        for (int each:numbers
             ) {
            System.out.print(each+" ");

        }
    }
}
