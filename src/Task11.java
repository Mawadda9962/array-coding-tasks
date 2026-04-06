public class Task11 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        int[] result = maxEnd(nums);

        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i] + " ");
        }

    }

    public static int[] maxEnd(int[] nums) {
        int max;

        if (nums[0] > nums[nums.length - 1]) {
            max = nums[0];
        } else {
            max = nums[2];
        }

        nums[0] = max;
        nums[1] = max;
        nums[2] = max;

        return nums;
    }


}
