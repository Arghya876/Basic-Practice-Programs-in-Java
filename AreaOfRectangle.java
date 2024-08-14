import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String arg[]){
        double length, breath;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Length of the Rectangle: ");
        length = sc.nextDouble();
        System.out.print("Enter the Breath of the Rectangle: ");
        breath = sc.nextDouble();
        sc.close();
        System.out.println("Area of the Rectangle is: "+(length*breath));
    }
}
