import java.util.Scanner;

public class MaxBtwTwo {
    public static void main(String arg[]){
        int num1, num2;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the 1st Number: ");
        num1 = sc.nextInt();
        System.out.print("Enter the 2nd Number: ");
        num2 = sc.nextInt();
        sc.close();

        if(num1 > num2){
            System.out.println("The Max Number between "+num1+" and "+num2+" is: "+num1);
        }
        else if(num2 > num1){
            System.out.println("The Max Number between "+num1+" and "+num2+" is: "+ num2);
        }  
        else{
            System.out.println("Both Numbers are Equal");
        }  
    } 
}
