public class MaxWealth {
    public static void main(String[] args) {
        int[][] accounts = {{23 , 44 , 39 , 20},
                            {10,18,19,20},
                            {10,39,28,38},
                            {22,78}
    };
    System.out.println(maxWealth(accounts));
    }
    static int maxWealth(int[][] accounts){
        int ans = Integer.MIN_VALUE;
        for(int person = 0 ; person<accounts.length; person++){
            //When you start a new row , take a new sum for that row
            int sum = 0;
            for(int account = 0 ; account<accounts[person].length ; account++){
                sum+= accounts[person][account];
            }
            //Compare the sum of each row with the overall max wealth
            if(sum > ans){
                ans = sum;
            }
        
        }
        return ans;
    }

}
