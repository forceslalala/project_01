package zuoye_2;

import java.util.Scanner;
public class test_5_38 {
    public static void main(String[] args) {
        String er = " ";
        Scanner input = new Scanner(System.in);
        System.out.print("请输入一个十进制整数：");
        int num = input.nextInt();
        while(num > 0){
            er = num % 8 + er;
            num /= 8;
        }
        System.out.println(er);
    }
}
