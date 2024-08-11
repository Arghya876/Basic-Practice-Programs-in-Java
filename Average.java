import java.util.Scanner;

public class Average {
    public static void main(String arg[]){
        int marks1, marks2, marks3, marks4, marks5;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Marks of Five Subjects: ");
        marks1 = sc.nextInt();
        marks2 = sc.nextInt();
        marks3 = sc.nextInt();
        marks4 = sc.nextInt();
        marks5 = sc.nextInt();
        sc.close();

        double avg = (marks1 + marks2 + marks3 + marks4 + marks5)/5.0;
        System.out.print("The Average of Five Subjects is: "+ avg);
    }
}
