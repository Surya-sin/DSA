public class EvenDigits {
    public static void main(String[] args) {
        int[] nums = {23 , 456 , 76 , 3 , 4958 , 6868};
        System.out.println(findNumbers(nums));
    }

    static int findNumbers(int[] nums){ // Total values with even digits
        int count = 0;
        for(int num:nums){
            if(even(num)){
                count++;
            }
        }return count;
    }


    static boolean even(int n){  // To find whether digits are even or odd
        int NumberofDigits = digits(n);
        return NumberofDigits%2==0;
    } 

    static int digits(int n){      // To count Number of digits
        int count = 0;
        while(n>0){
            count++;
            n = n/10;
        }return count;
    }
}
