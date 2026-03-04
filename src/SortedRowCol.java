import java.util.Arrays;

public class SortedRowCol {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 4, 7, 8,},
                {2, 5, 10, 13,},
                {3, 6, 11, 14}
        };
        System.out.println(Arrays.toString(search(arr,6)));
    }


    static int[] search(int[][] matrix, int target){


    int r=0;
    int c=matrix[0].length-1;
    while(r<matrix.length &&c>=0){
        if(matrix[r][c]==target){
            return new int[]{r,c};
        }
        else if (matrix[r][c]<target){
            r++;
        }
        else{
            c--;
        }

    }
    return new int[]{-1,-1};
}}
