public class Task26 {
    public static void main(String[] args) {
        int[] a = {1, 2, 3};
        int[] b = {7, 9, 8};
        int[] result = front11( a, b);

        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i] + " ");
        }

    }

    public static int[] front11(int[] a, int[] b) {
        int[] result = new int[2];

        result[0] = a[0];
        result[1] = b[0];
        return result;
    }
}


