import java.util.Scanner;

public class LeapYear {
    public static void main(String []arg){
        int year;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Year: ");
        year = sc.nextInt();
        sc.close();
        if(year%4 == 0 && year%100 != 0 || year%400 == 0 && year%100 == 0){
            System.out.print("The Year is a Leap Year");
        }
        else{
            System.out.print("The Year is not a Leap Year");
        }
    }
}
