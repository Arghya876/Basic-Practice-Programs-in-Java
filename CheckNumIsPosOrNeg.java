import java.util.Scanner;

public class CheckNumIsPosOrNeg {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Any Nummber: ");
        num = sc.nextInt();
        sc.close();
        if(num<0){
            System.out.print("Nuumber is Negative");
        }
        else if(num == 0){
            System.out.print("Number is Zero Nither Positive nor Negative");
        }
        else{
            System.out.print("Number is Positive");
        }
    }
}
