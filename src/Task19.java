public class Task19 {
        public static void main(String[] args) {
            int[] arr ={1,2,3};
            int[] result =rotateLeft3(arr);
            for (int i = 0; i < result.length; i++){
                System.out.println(result[i]);
            }

        }
        public static int[] rotateLeft3(int[] nums) {
            return new int[]{nums[1], nums[2], nums[0]};
        }
    }