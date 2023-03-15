package practiseTasks.day_16;

public class StarMuster {

    public static void main(String[] args) {
        String result="*";
        for (int i = 0; i <10; i++) {

            for (int j = 0; j <i; j++) {
                System.out.print(result+" ");
            }
            System.out.println("\n");
        }
    }
}
