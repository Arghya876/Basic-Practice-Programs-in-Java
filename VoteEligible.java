import java.util.Scanner;

public class VoteEligible {
    public static void main(String arg[]){
        int age;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Age: ");
        age = sc.nextInt();
        sc.close();
        if(age >= 18){
            System.out.println("You are Eligible for Votes");
        }
        else{
            System.out.println("You are Not Eligible for Votes");
        }
    }  
}