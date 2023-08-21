import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        // System.out.println("HELLO WORLD");
        Scanner in = new Scanner(System.in);
       
        // for(int num = 1 ; num<=n ; n++){
        //     // System.out.println(num);
        //     System.out.println("Hello World");
        // }

        // int num=1;
        // while(num<=n){
        //     System.out.println(num);
        //     num++;
        // }

        //PRINT LARGEST
        // int a = in.nextInt();
        // int b = in.nextInt();
        // int c = in.nextInt();
            // int max = a ;
            // if(b>a){
            //     max=b;
            // }
            // if(c>b){
            //     max=c;
            // }
            // System.out.println(max);

        //Case CHeck
        //     char ch = in.next().trim().charAt(0);
        //     if(ch>='a' && ch<='z'){
        //         System.out.println("Lowercase");
        //     }else{
        //         System.out.println("Uppercase");
        // }

        // Fibonnaci Number
        // int n = in.nextInt();
        // int a = 0;
        // int b = 1;
        // int count = 2;
        // while(count<=n){
        //     int temp = b;
        //     b = a+b;
        //     a = temp;
        //     count++;
        // }
        // System.out.println(b);

        //Counting occurences of 5
        // int n = in.nextInt();
        // int count = 0;
        // while(n>0){
        //     int rem = n%10;
        //     if(rem == 5){
        //         count++;
        //     }
        //     n = n/10;
        // }
        // System.out.println(count);

        //Revrese the number
        int num = 457685;
        int ans = 0;
        while(num>0){
            int rem = num%10;
            num/=10;

            ans = ans*10 + rem;

        }
        System.out.println(ans);


        }
}