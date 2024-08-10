import java.util.Scanner;

public class MaxBtwThree {
    public static void main(String []arg){
        int num1, num2, num3;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the 1st Number: ");
        num1 = sc.nextInt();
        System.out.print("Enter the 2nd Number: ");
        num2 = sc.nextInt();
        System.out.print("Enter the 3rd Number: ");
        num3 =sc.nextInt();
        sc.close();

        if(num1>num2 && num1>num3){
            System.out.println("The maximum number is: "+num1);
        }
        else if(num2>num1 && num2>num3){
            System.out.println("The maximum number is: "+num2);
        }
        else{
            System.out.println("The maximum number is: "+num3);
        }
    }
}
