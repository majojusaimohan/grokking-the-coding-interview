package arrays;

public class RunningSum {

    public int[] runningSum(int[] nums) {
        int[] result = new int[nums.length];
        result[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            result[i] = result[i - 1] + nums[i];
        }
        return result;
    }

    public static void main(String[] args) {
        RunningSum rs = new RunningSum();
        int[] nums = {1, 2, 3, 4};
        int[] result = rs.runningSum(nums);
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
