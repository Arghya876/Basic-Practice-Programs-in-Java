import java.util.Scanner;
public class OddEven {
    public static void main (String []arg){
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        num = sc.nextInt();
        sc.close();
        if(num%2 == 0){
            System.out.println("The Number is an Even Number.");
        }
        else{
            System.out.println("The Number is an Odd Number.");
        }
    }    
}