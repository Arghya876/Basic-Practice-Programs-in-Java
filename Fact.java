import java.util.Scanner;

public class Fact {
    public static void main(String arg[]){
        int num, i, fact=1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        num = sc.nextInt();
        sc.close();

        for(i=1; i<=num; i++){
            fact = fact*i;
        }
        System.out.println("Factorial is: "+fact);
    }
}