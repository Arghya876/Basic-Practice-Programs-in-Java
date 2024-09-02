import java.util.Scanner;

public class SwapTwoNum {
    public static void main(String []arg){
        int a,b,c;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st Number: ");
        a = sc.nextInt();
        System.out.print("Enter 2nd Number: ");
        b = sc.nextInt();
        c = a;
        a = b;
        b = c;
        sc.close();
        System.out.println("After Swapping:");
        System.out.println("The Value of 1st Number: "+ a);
        System.out.println("The Value of 2nd Number: "+b);
    }    
}