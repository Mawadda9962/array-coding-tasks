public class Task17 {
    public static void main(String[] args) {
        int[] a1 = {4, 5};
        int[] b1 = {1, 2, 3};
        int[] result = make2(a1, b1);

        for (Integer n : result) {
            System.out.println(n);
        }

    }
    public static int[] make2(int[] a, int[] b) {
        int[] result = new int[2];
        if (a.length >= 2){

            result[0] = a[0];
            result[1] = a[1];
        } else if (a.length == 1){

            result[0] = a[0];
            result[1] = b[1];
        } else {

            result[0] = b[0];
            result[1] = b[1];
        }

    return result;


    }

}
