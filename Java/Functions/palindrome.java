package Functions;

import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = in.nextInt();
        ispalindrome(n);

    }

    static void ispalindrome(int n){
        int temp = n;
        int rev = 0 ; 
        while(temp>0){
            int rem = temp%10;
            rev = rev*10 + rem;
            temp = temp/10;
        }
        if(rev==n){
            System.out.println("The given number is a palindrome");
        }
        else{
            System.out.println("The given number is not a palindrome");
        }
    }
}
