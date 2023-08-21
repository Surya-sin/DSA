package Functions;

import java.util.Scanner;

public class oddeven {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the no. you want to check : ");
        int n = in.nextInt();
        iseveodd(n);


    }

    static void iseveodd(int n){
        if(n<=1){
            System.out.println("Neighter odd nor even");
        }
        if(n%2==0){
            System.out.println("The number entered is even");
        }
        else{System.out.println("Number is odd");};
        
    }
   



}
