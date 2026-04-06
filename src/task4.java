public class task4 {
    public static void main(String[] args){
        int[] a={1,2,3};
        int[] b={4,5,6};
        int[] result= middleWay(a,b);

        System.out.println (result[0] + " " + result[1]);
    }
    public static int[] middleWay(int[] a, int[] b){

        int[] middle = new int[2];

        middle[0] = a[1];
        middle[1] = b[1];

        return middle;

    }


}


