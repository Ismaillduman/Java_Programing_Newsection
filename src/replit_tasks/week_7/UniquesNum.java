package replit_tasks.week_7;

public class UniquesNum {
    public static void main(String[] args) {

        int count=1;
        int[] nums= {1,1,2,3,4,3,4};
        for (int i = 0; i < nums.length; i++) {

            for (int j = 0; j < nums.length; j++) {

                if(nums[i]==nums[j]&&i!=j) {
                    break;
                }
                if(j == nums.length ){
                    System.out.println(" unique elements in an array is [%d] : %d" + count+ nums[i]);

                            ++count;
                }
            }


    }

    }}