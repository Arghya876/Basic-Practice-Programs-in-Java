import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String arg[]){
        final double pi=3.14; // Final variable: When a variable is declared as final, its value cannot be changed once it has been assigned
        double radius, area;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Radius of the Circle: ");
        radius = sc.nextDouble();
        sc.close();
        area = pi*radius*radius;
        System.out.println("The Area of the Circle is: "+area);
    }
}
