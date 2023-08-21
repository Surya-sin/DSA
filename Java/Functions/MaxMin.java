package Functions;

import java.util.Scanner;

import javax.management.MBeanInfo;

public class MaxMin {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the first integer : ");
        int a = in.nextInt();
        System.out.println("Enter the second integer : ");
        int b = in.nextInt();
        System.out.println("Enter the third integer : ");
        int c = in.nextInt();

        int largest = largest(a,b,c);
        System.out.println("The largest among the three is : " + largest);
        int smallest = smallest(a,b,c);
        System.out.println("The smallest among the three is : " + smallest);


    }

    static int largest(int a ,int b ,int c){
        int max = a;
        if(b>max){
            max=b;
        }
        if(c>max){
        max = c;
        }
        return max;
    }

    static int smallest(int a ,int b ,int c){
        int min = a;
        if(b<min){
            min=b;
        }
        if(c<min){
        min = c;
        }
        return min;
    }



}
