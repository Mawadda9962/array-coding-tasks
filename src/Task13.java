public class Task13 {
    public static void main(String[] args) {
        int[] nums = {4, 5, 6};
        int[] result = makeLast(nums);

        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i] + " ");
        }

    }

    public static int[] makeLast(int[] nums) {
        int[] result = new int[nums.length * 2];
          result[result.length - 1] = nums[nums.length - 1];

          return result;
    }
}
