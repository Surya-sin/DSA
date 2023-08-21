import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String fruit = in.next();

        switch(fruit){
            case("Mango"):
            System.out.println("King of fruits");
            break;
            case("Apple"):
            System.out.println("Red sweet");
            break;
            case("Grape"):
            System.out.println("Green sweet");
            default:
            System.out.println("PLease enter a valid fruit");

        }

    }
}
