public class Task7 {
    public static void main(String[] args){
        int[] arr = {1,2,3,4};
        int[] result = makeMiddle(arr);

        for (int i = 0; i < result.length; i++){
            System.out.println(result[i] + "");
        }
    }

    public static int[] makeMiddle(int[] nums) {
        int mid = nums.length / 2 ;
        int mid2 = nums.length /2 + 1;

        return new int[]{mid,mid2};
    }
}
