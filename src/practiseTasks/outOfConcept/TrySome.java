package practiseTasks.outOfConcept;

public class TrySome {
    public static void main(String[] args) {
        String[] arr = {"ismail duman", "yumak damla", "busra ay", "yusuf tekin", "damla kedi"};

        int countE = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].toLowerCase().contains("e")) {

                countE++;
            }

    }
        System.out.println(countE);

    }
}
