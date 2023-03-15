package replit_tasks.week_6;

public class EvenAndOdd {
    public static void main(String[] args) {
        String result_1="";
        String result_2="";
        for (int i = 1; i < 21; i++) {
            if(i%2==0){
                result_1+=i+" ";
                }

        }System.out.print(result_1.trim());
        System.out.println();
        for (int j = 0; j < 21; j++) {
            if(j%2!=0){
               result_2+=j+" ";
               }

        }
        System.out.print(result_2.trim());

    }
}
