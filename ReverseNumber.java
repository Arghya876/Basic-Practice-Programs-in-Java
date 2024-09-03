import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        int num, rnum;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        num = sc.nextInt();
        sc.close();
        System.out.print("Reverse Order is: ");
        while(num>0){
            rnum = num%10;
            num = num/10;
            System.out.print(rnum);
        }
    }
}
