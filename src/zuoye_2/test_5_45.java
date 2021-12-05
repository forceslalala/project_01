package zuoye_2;

import java.util.Scanner;
public class test_5_45 {
    public static void main(String[] args) {
        double sumOfSquares = 0, sum = 0, tempNumber;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 10 numbers: ");
        for(int i = 1;i <= 10;i++) {
            tempNumber = input.nextDouble();
            sumOfSquares += tempNumber * tempNumber;
            sum += tempNumber;
        }
        System.out.printf("The mean is %.2f\n", sum / 10);
        System.out.printf("The standard deviation is %.5f", Math.sqrt((sumOfSquares - (sum * sum / 10)) / 9));

    }
}
