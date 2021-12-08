package zuoye_3;

import java.util.Scanner;
public class test_7_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 10 numbers:");
        int[] num = new int[10];
        int[] out = new int[10];
        boolean[] count = new boolean[11];
        int size = 0;
        for (int i = 0; i < 10; i++) {
            num[i] = input.nextInt();
            if(!count[num[i]]){
                out[size] = num[i];
                size++;
                count[num[i]] = true;
            }
        }
        System.out.println("The number of distinct numbers is " + size);
        System.out.print("The distinct numbers are: ");
        for (int i = 0; i < size; i++) {
            System.out.print(out[i] + " ");
        }
    }
}
