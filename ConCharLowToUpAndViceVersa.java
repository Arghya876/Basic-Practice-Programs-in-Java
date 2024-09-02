import java.util.Scanner;
public class ConCharLowToUpAndViceVersa {
    public static void main(String []arg){
        char ch, temp;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Any Character: ");
        ch = sc.next().charAt(0);
        sc.close();
        if(ch>='A' && ch<='Z'){
            temp = Character.toLowerCase(ch);
            System.out.print("Convert into Lower Case: "+temp);
        }
        else{
            temp = Character.toUpperCase(ch);
            System.out.print("Convert into Upper Case: "+temp);
        }
    }
}
