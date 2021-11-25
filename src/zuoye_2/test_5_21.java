package zuoye_2;
import java.util.Scanner;
public class test_5_21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double monthPayment;
        double totalPayment;
        double rate;
        System.out.print("Loan Amount: ");
        double money = input.nextDouble();
        System.out.print("Number of Years: ");
        int year = input.nextInt();
        System.out.printf("%-20s","Interest Rate");
        System.out.printf("%-20s","Monthly Payment");
        System.out.printf("%-20s","Total Payment");
        System.out.println();
        for (double i = 5.0; i <= 8.0; i += 0.125) {
            rate = i / 100;
            monthPayment = (money * rate / 12) / (1 - 1 / (Math.pow(1 + rate / 12, year * 12)));
            totalPayment = monthPayment * year * 12;
            System.out.printf("%4.3f",i);
            System.out.print("%");
            System.out.printf("              %5.2f              %8.2f\n",monthPayment,totalPayment);
        }
    }
}
