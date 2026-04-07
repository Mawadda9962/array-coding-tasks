public class Task24 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int[] result = swapEnds(arr);

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }

    public static int[] swapEnds(int[] nums){
        int temp = nums[0];
        nums[0] = nums[nums.length - 1];
        nums[nums.length - 1] = temp;
        return nums;
    }
}