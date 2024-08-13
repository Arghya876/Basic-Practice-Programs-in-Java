// Conditions:
// Salary <= 10,000 ----> No Tax
// Salary > 10,000 btw Salary <=1,00,000 ----> 10%
// Salary > 1,00,000 ----> 20% Tax 

import java.util.Scanner;

public class TaxCalculation {
    public static void main(String arg[]){
        int sal;
        double tax;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Salary: ");
        sal = sc.nextInt();
        sc.close();

        if(sal <= 10000){
            System.out.println("Salary: "+sal+" Rs., No Tax");
        }
        else if (sal > 10000 && sal <= 100000) {
            tax = sal*0.10;
            System.out.println("Salary: "+sal+" Rs., Tax: "+tax+" Rs.");
        }
        else{
            tax = sal*0.20;
            System.out.println("Salary: "+sal+" Rs., Tax: "+tax+" Rs.");
        }
    }
}
