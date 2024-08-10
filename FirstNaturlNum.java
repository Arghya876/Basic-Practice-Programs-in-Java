import java.util.Scanner;

public class FirstNaturlNum {
    public static void main(String arg[]){
        int num, i;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the No. of Term: ");
        num = sc.nextInt();
        sc.close();

        System.out.println("The N Term of Natural Number: ");
        for(i=1; i<=num; i++){
            System.out.print(i+" ");
        }
    }
}
