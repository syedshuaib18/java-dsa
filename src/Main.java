import java.util.Arrays;

public class Main{
    public static double slide(int arr[],int k) {
        int wsum = 0;
        int maxsum = 0;
        for (int i = 0; i < k; i++) {
            wsum += arr[i];

        }
        maxsum = wsum;
        for (int i = k; i < arr.length; i++) {
            wsum += arr[i];
            wsum -= arr[i - k];
            maxsum=Math.max(maxsum,wsum);



        }
        return (double) maxsum/k;
    }
        public static void main(String[]args){
        int arr []={1,2,3,4,5};
        int k=3;

            System.out.println(slide(arr,k));

    }
}









