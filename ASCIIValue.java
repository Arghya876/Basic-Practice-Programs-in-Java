import java.util.Scanner;
/*
 * To Convert the Character in ASCII Value:
 * 1. int convert = ch; // Implicit Type Casting
 * 2. ((int)ch); // Explicit Type Casting
 */
public class ASCIIValue {
    public static void main(String arg[]){
        char ch;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Character: ");
        ch = sc.next().charAt(0);
        sc.close();

        System.out.print("The ASCII Value of the Character is: "+((int)ch));
    }
}
