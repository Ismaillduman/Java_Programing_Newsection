package replit_tasks.week_7;

public class MaxNum {

    public static void main(String[] args) {
        int[] nums = {2, 4, 2, 3, -2};

        int maxNum = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > maxNum) {
                maxNum = nums[i];
            }
        }
        System.out.println(maxNum);

    }
}
