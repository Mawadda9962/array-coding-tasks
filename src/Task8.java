public class Task8 {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5};
        int[] result = midThree(arr);

        for (int i = 0; i < result.length; i++){
            System.out.println(result[i] + "");
        }
    }

        public static int[] midThree(int[] nums) {
            int mid = nums.length / 2 ;
            int mid2 = nums.length /2 + 1;
            int mid3 = nums.length /2 + 2;

            return new int[]{mid,mid2,mid3};
    }
}