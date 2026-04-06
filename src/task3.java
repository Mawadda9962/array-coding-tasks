public class task3 {
    public static void main(String[] args) {
        int[] nums={1,2,3};
        int[] result = revers(nums);

        System.out.println(result[0] + " " + result[1] + " " + result[2]);
    }

    public static int[] revers(int[] nums){
        int[] reversed = new int[3];

        reversed[0] = nums[2];
        reversed[1] = nums[1];
        reversed[2] = nums[0];

        return reversed;
    }


}
