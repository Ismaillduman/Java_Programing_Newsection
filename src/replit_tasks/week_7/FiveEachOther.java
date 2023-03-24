package replit_tasks.week_7;

public class FiveEachOther {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6};
        boolean result = true;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1] && nums[i] == 5) {
                result = true;
                break;
            } else {
                result = false;
            }

        }
        System.out.println(result);
    }


}

