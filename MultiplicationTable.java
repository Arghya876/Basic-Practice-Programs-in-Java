import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String arg[]){
        int num, i;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        num = sc.nextInt();
        sc.close();

        System.out.println("The Table of "+num+" is:");
        for(i=1; i<=10; i++){
            System.out.println(num+" x "+i+" = "+(num*i));
        }
    }
}
