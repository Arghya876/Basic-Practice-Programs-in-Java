import java.util.Scanner;

public class CountNumDigits {
    public static void main(String arg[]){
        int num, count=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        num = sc.nextInt();
        sc.close();

        while (num>0) {
            num = num/10;
            count++;
        }
        System.out.println(count);
    }    
}