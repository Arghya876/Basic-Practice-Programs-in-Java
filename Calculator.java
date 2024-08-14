import java.util.Scanner;

public class Calculator {
    public static void main(String arg[]){
        double num1, num2, ch, result;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the 1st Number: ");
        num1 = sc.nextDouble();
        System.out.print("Enter the 2nd Number: ");
        num2 = sc.nextDouble();
        System.out.print("Select Operator (+,-,*,/): ");
        ch = sc.next().charAt(0);
        sc.close();
        if(ch == '+'){
            result = num1+num2;
            System.out.println("The Result is: "+ result);
        }
        else if(ch == '-'){
            result = num1-num2;
            System.out.println("The Result is: "+ result);
        }
        else if(ch == '*'){
            result = num1*num2;
            System.out.println("The Result is: "+ result);
        }
        else if(ch == '/'){
            if(num2==0){
                System.out.println("Zero Diviton Error");
            }
            else{
                result = num1/num2;
                System.out.println("The Result is: "+ result);
            }
        }
    }
}
