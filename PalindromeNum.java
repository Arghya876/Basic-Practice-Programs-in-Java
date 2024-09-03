import java.util.Scanner;

public class PalindromeNum {
    public static void main(String []arg){
        int num, OriNum, dig, palindrome=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        num = sc.nextInt();
        sc.close();
        OriNum = num;
        while (num>0) {
            dig = num%10;
            palindrome = (palindrome*10) + dig;
            num = num/10;
        }
        if(palindrome == OriNum){
            System.out.print("The Number is a Palindrome Nummber");
        }
        else{
            System.out.print("The Number is not a Palindrome Number");
        }
    }
}
