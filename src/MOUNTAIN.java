

public class MOUNTAIN {

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 4, 3, 2, 1};
        int max = arr[0];
        int  ans=mountain( arr, max);
        System.out.println(ans);

    }

    static int mountain(int[] arr, int max) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;

    }}







