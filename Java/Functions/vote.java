package Functions;

import java.util.Scanner;

public class vote {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your age : ");
        int age = in.nextInt();
        iseligible(age);

    }

        static void iseligible(int age){
          if(age>=18){
            System.out.println("YOu are eligible to vote");
          }
          else{
            System.out.println("You are not eligible to vote");
          }
         
        }
}
