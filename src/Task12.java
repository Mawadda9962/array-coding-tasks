public class Task12 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        int[] result = makeEnd(nums);

        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i] + " ");
        }

    }

    public static int[] makeEnd(int[] nums) {

        return new int[]{nums[0], nums[nums.length - 1]};
    }
}
