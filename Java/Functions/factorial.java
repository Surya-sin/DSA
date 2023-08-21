package Functions;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number for its factorial" );
        int n = in.nextInt();
        System.out.println(isfactorial(n));


    }

    static int isfactorial(int n){
        int fact =1;
        for(int i =1; i<=n ; i++){
            fact = fact*i;
        } return fact;
    }
}
