package replit_tasks.week_7;

public class UniquesNum {
    public static void main(String[] args) {


        int[] nums = {1, 1, 2, 3, 4, 3, 4, 4, 4, 4};

        int count = 1;
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            for (int j = i + 1; j < nums.length; j++) {

                if (num == nums[j]) {
                    count++;
                    break;


                }


            }

        }
        System.out.println(count);

    }
}