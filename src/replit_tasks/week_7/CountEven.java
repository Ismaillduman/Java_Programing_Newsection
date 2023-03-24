package replit_tasks.week_7;

public class CountEven {
    public static void main(String[] args) {
        int[]nums={1,21,41,81,161,7};
        int count=0;

        for (int i = 0; i < nums.length; i++) {

            if(nums[i]%2==0){
                count++;
            }
        }
        System.out.println(count);
    }
}
