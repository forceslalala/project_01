package zuoye_2;

import java.util.Scanner;
public class test_5_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of lines: ");
        int num = input.nextInt();
        for (int k = 0; k < num; k++) {
            for (int i = -num; i <= num; i++) {
                if (Math.abs(i) <= k) {
                    System.out.print(Math.abs(i) + 1 + "  ");
                } else {
                    System.out.print("   ");
                }
            }
            if (k != num - 1) {
                System.out.println();
            }
        }
    }
}
