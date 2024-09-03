import java.util.Scanner;

public class PrimeNum {
    public static void main(String[] args) {
        int num, i=2;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        num = sc.nextInt();
        sc.close();
        while (i<num) {
            if(num%i != 0){
                System.out.println("This is a Prime Number");
                break;
            }
            else{
                System.out.println("This is not a Prime Number");
                break;
            }
        }i++;
    }
}
