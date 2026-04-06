public class Task15 {
    public static void main(String[] args) {
        int[] a = {1, 2};
        int[] b = {3, 4};
        int[] result = plusTwo(a, b);

        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i] + " ");
        }

    }

        public static int[] plusTwo(int[]a, int[] b) {
            int[] result = new int[4];

            result[0] = a[0];
            result[1] = a[1];
            result[2] = b[0];
            result[3] = b[1];

            return result;
        }
    }


