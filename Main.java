package stia1123_test2;
import java.util.Scanner;
/**
 *
 * @author Amirul Luqman
 */
public class Main {
    public static void main(String[] args){
        String name, id, incomeType;
        double amount, tax;
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter staff name: ");
        name = sc.nextLine();
        System.out.print("Enter staff ID: ");
        id = sc.nextLine();
        System.out.print("Enter income type: ");
        incomeType = sc.nextLine();
        System.out.print("Enter income amount: ");
        amount = sc.nextDouble();
        System.out.print("Enter tax percentage: ");
        tax = sc.nextDouble();
        System.out.println("");
        
        Income x = new Income(incomeType, amount, tax);
        Staff y = new Staff(name, id, x);
        
        y.displayStaffInfo();
        y.displayIncomeInfo();
        
    }
}
