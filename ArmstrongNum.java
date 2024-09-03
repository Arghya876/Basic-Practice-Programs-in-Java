import java.util.Scanner;

public class ArmstrongNum {
    public static void main(String[] args) {
        int num, OriNum, dig, arm=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        num = sc.nextInt();
        sc.close();
        OriNum = num;
        while (num>0) {
             dig = num%10;
             num = num/10;
             arm = (dig*dig*dig) + arm;
        }
        if(OriNum == arm){
            System.out.print("The Number is a Armstrong Number");
        }
        else{
            System.out.print("The Number is not a Armstrong Number");
        }
    }
}
