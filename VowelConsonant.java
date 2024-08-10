import java.util.Scanner;

public class VowelConsonant {
    public static void main(String agr[]){
        char ch;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Character: ");
        ch = sc.next().charAt(0);
        sc.close();

        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
            System.out.println("The Character is a Vowel");
        }
        else if(ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U'){
            System.out.println("The Character is a Vowel");
        }
        else{
            System.out.println("The Character is a Consonant");
        }    
    }
}
