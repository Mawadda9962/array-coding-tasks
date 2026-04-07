public class Task25 {
        public static void main(String[] args) {
            int[] nums = {1, 2, 3};
            int[] result = frontPice(nums);

            for (int i = 0; i < result.length; i++) {
                System.out.println(result[i] + " ");
            }

        }

        public static int[] frontPice(int[] nums) {
            int[] result = new int[2];

            result[0] = nums[0];
            result[1] = nums[1];
            return result;
        }
    }


