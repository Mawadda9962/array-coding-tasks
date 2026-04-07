public class Task23 {
    public static void main(String[] args) {
        int[] nums = {2, 2};
        System.out.println(double23(nums));
    }

    public static boolean double23(int[] nums){
        if ((nums[0] == 2 && nums[1] == 2) || (nums[0] == 3 && nums[1] == 3)){
            return true;
        }
        return false;
    }
}


