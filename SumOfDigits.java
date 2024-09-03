import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        int num,dig,sum=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        num = sc.nextInt();
        sc.close();
        while (num>0) {
            dig = num%10;
            num = num/10;
            sum = sum + dig;
        }
        System.out.print("The Sum of the Digits is: "+sum);
    }
}
