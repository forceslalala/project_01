package zuoye_2;
import java.util.Scanner;
public class test_5_22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Loan Amount: ");
        double Amount = input.nextInt();
        System.out.print("Number of Years: ");
        int Year = input.nextInt();
        System.out.print("Annual Interest Rate: ");
        double Rate = input.nextInt();
        System.out.print("\nMonthly Payment: ");

        double MonthlyPayment =(Amount * Rate / 1200) / (1 - 1 /
                Math.pow(1 + Rate / 1200, Year * 12));
        double TotalPayment = MonthlyPayment * Year *12;
        System.out.println("Monthly Payment: " + MonthlyPayment);
        System.out.println("Total Payment: " + TotalPayment);

        System.out.println("Payment#  Interest\t\tPrincipal\t\tBalance");

        double Interest, Principal;
        for (int i = 1; i <= Year*12; i++) {
            Interest = Rate / 1200 * Amount;
            Principal = MonthlyPayment - Interest;
            Amount -= Principal;
            if(i == Year * 12){
                Principal += Amount;
            }
            System.out.print(i + "\t\t  ");
            System.out.printf("%5.2f\t\t  %6.2f\t\t\t%7.2f\n", Interest, Principal, Amount);
        }
    }
}
