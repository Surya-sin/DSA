public class Main{
    public static void main(String[] args) {
        int[] arr = {-20 , -8 , -4 , 0 , 2 , 10 , 15 , 29 , 40 , 58 , 90 , 101};
        int target = 2;
        System.out.println(binary(arr, target));
    }

    static int binary(int[] arr ,int target){
        int start = 0;
        int end = arr.length - 1;

        while(start<=end){
        // find the middle element
        //  int mid = (start+end)/2; might be possible that (start+end) exceeds the integer limit so we use different formula
            int mid = start + (end-start)/2 ;

            if(target<arr[mid]){
                end = mid-1;
            }else if(target>arr[mid]){
                start = mid+1;
            }else{
                //ans found
                return mid;
            }
        }
            return -1;
    }
}