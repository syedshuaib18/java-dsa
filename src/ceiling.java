public class ceiling {
    public static void main (String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int target = 2;
        int ans =Ceiling(arr,target);
        System.out.println(ans);
    }

    static int Ceiling(int []arr,int target){
        int start=0;
        int end=arr.length-1;
        if(target>arr[arr.length]){
            return -1;
        }
        while(start<=end){
            int mid =start+(end-start)/2;
            if(target ==arr[mid]){
                return arr[mid];
            }
            else if(target >arr[mid]){
                start=mid +1;
            }
            else{
                end=mid-1;
            }
        }
        return arr[start];
    }
}
