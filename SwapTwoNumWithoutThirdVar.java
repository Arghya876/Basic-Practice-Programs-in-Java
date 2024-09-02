import java.util.Scanner;
public class SwapTwoNumWithoutThirdVar {
    public static void main(String []arg){
        int num1, num2;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the 1st Number: ");
        num1 = sc.nextInt();
        System.out.print("Enter the 2nd Number: ");
        num2 = sc.nextInt();
        sc.close();
        num1 = num1+num2;
        num2 = num1-num2;
        num1 = num1-num2;
        System.out.println("After Swapping: ");
        System.out.println("The Value of the 1st Number: "+num1);
        System.out.println("The Value of the 2nd Number: "+num2);
    }
}
