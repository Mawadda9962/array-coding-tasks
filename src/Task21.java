public class Task21 {
    public static void main(String[] args) {
        int[] nums={2,5};
        System.out.println (has23(nums));
    }

    public static boolean has23(int[] nums){
        if (nums[0] == 2 || nums[0] == 3 ){
            return true;
        }
        return false;
    }
}

