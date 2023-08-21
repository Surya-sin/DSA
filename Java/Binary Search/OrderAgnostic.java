public class OrderAgnostic {
    public static void main(String[] args) {
        int[] arr = {100 , 90 , 83 , 29 , 3 , -1 , -10 ,-15 , -30};
        int target = 29;
        System.out.println(OrderAgnBS(arr, target));
    }

    static int OrderAgnBS(int[] arr , int target){
        int start = 0 ;
        int end = arr.length -1;
         
        //find whether the array is ascending or descending
        boolean isasc = arr[start] < arr[end];

        while(start<end){
            int mid = start + (end - start)/2;

            if(arr[mid]==target){
                return mid;
            }
            if(isasc){
                if(target<arr[mid]){
                    end = mid-1;
                }
                else (target > arr[mid]){
                    start=start+1;
                }
            }
            else{
                 if(target<arr[mid]){
                    start = start + 1;
                }
                else(target>arr[mid]){
                    end = end + 1;
                }
            }
        }
        return -1;
    }
}
