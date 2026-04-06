public class task5 {
    public static void main(String[] args){
        int[] nums={4,5};
        System.out.println(no23(nums));


    }

    public static boolean no23(int[] nums) {
        if (nums.length == 2){
            if((nums[0] != 2 && nums[0] != 6) && (nums[1] != 2 && nums[1] != 6)){
                return true;
            }
        }
        return false;

    }
}


