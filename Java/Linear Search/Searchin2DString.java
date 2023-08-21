import java.util.Arrays;

public class Searchin2DString {
    public static void main(String[] args) {
        int[][] arr = {
            {23 , 10 , 59 , 49 },
            {18,29,38},
            {12 , 34 , 54 , 10},
            {10 , 84 , 30}
        };
        

    //     int target = 29;
    //     int[] ans = search(arr,target);  
    //    System.out.println(Arrays.toString(ans));

    //       System.out.println(max(arr));
        

    }

    // static int[] search(int[][] arr , int target){
    //     //suppose array is not empty
    //     for(int row=0 ; row<arr.length ; row++){
    //         for(int col = 0; col<arr[row].length ; col++){
    //             if(arr[row][col] == target){
    //                 return new int[]{row,col};
    //             }

    //         }
    //     }
    //     return new int[]{-1,-1};
    // }

       static int max(int[][] arr){
        //suppose array is not empty
        int max = Integer.MIN_VALUE;
        for(int row=0 ; row<arr.length ; row++){
            for(int col = 0; col<arr[row].length ; col++){
                if(arr[row][col] > max){
                    max = arr[row][col];
                }

            }
        }
        return max;
    }
}
