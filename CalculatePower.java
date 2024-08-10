import java.util.Scanner;

public class CalculatePower {
    public static void main(String arg[]){
        int base, i, power, result=1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base: ");
        base = sc.nextInt();
        System.out.print("Enter power: ");
        power = sc.nextInt();
        sc.close();

        for(i=1; i<=power; i++){                // Using for Loop
            result = result * base;  
        }

        // result = (int)Math.pow(base, power); // Using Math.pow Function
        System.out.print("The Power is: "+result);
    }
}
