public class SearchinRange {
    public static void main(String[] args) {
        int[] arr = {18 , 191 , 1282 ,33 , -33 , 92};
        int target = 1282;
        System.out.println(Range(arr , target , 1 , 4));       
    }

    static int Range(int[] arr , int target , int start , int end){
        if(arr.length==0){
            return -1;
        }
        for(int index = start ; index  <= end ; index++){
            int element = arr[index];
            if(element==index){
                return index;
            }
        }
        return -1;

    }
}
