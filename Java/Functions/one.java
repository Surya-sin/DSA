/*definition of functions
 * access modifier return_type name(){
 * body
 * return_statement;
 * }
 */
package Functions;

import java.util.Scanner;

public class one {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter your name : ");
    String naam = in.next();
    String output = greeting(naam);
    System.out.println(output);
    }



    static  String greeting(String name){
        String message = "Hello " + name;
        return message;
    }


    static void sum(){
        Scanner in = new Scanner(System.in);
        int num1 , num2 , sum;
        System.out.println("ENTER THE FIRST NUMBER : ");
        num1 = in.nextInt();
        System.out.println("ENTER THE SECOND NUMBER : ");
        num2 = in.nextInt();
        sum = num1 + num2;
        System.out.println("The sum is "+sum);


    }

    static int sum2(){
        Scanner in = new Scanner(System.in);
        int num1 , num2 , sum;
        System.out.println("ENTER THE FIRST NUMBER : ");
        num1 = in.nextInt();
        System.out.println("ENTER THE SECOND NUMBER : ");
        num2 = in.nextInt();
        sum = num1 + num2;
        return sum;
    }

    static int sum3(int a , int b){
        int sum = a+b;
        return sum;
    }


}
