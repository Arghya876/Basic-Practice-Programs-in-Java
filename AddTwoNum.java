import java.util.Scanner;

public class AddTwoNum {
    public static void main(String []arg){
        int num1, num2;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the 1st Number: ");
        num1 = sc.nextInt();
        System.out.print("Enter the 2nd Number: ");
        num2 = sc.nextInt();
        sc.close();

        System.out.println("The Sum of the Two Numbers is: "+(num1+num2));
    }
}
