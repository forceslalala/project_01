package zuoye_2;

import java.util.Scanner;
public class test_5_29 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("请输入年份和代表该年的第一个数字：");
        int year = input.nextInt();
        int day = input.nextInt();
        int num = 31;
        int start;
        for (int i = 1; i <= 12; i++) {
            System.out.print("\t\t\t  ");
            switch (i){
                case 1: System.out.print("January ");break;
                case 2: System.out.print("February ");break;
                case 3: System.out.print("March ");break;
                case 4: System.out.print("April ");break;
                case 5: System.out.print("May ");break;
                case 6: System.out.print("June ");break;
                case 7: System.out.print("July ");break;
                case 8: System.out.print("August ");break;
                case 9: System.out.print("September ");break;
                case 10: System.out.print("October ");break;
                case 11: System.out.print("November ");break;
                case 12: System.out.print("December ");break;
            }
            if(i==1 || i==3 || i==5 || i==7 || i==8 || i==10 || i==12){
                num = 31;
            }
            else if(i != 2){
                num = 30;
            }
            if(i == 2 && ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0))){
                num = 29;
            }
            else if(i == 2){
                num = 28;
            }
            System.out.println(year);
            System.out.println("—————————————————————————————————————————————");
            System.out.println("   Sun   Mon   Tue   Wed   Thu   Fri   Sat");
            start = 1;
            for (int j = 0; j < 5; j++) {
                if(start > num){
                    break;
                }
                for (int k = 0; k < 7; k++) {
                    if(k < day && j == 0){
                        System.out.print("      ");
                    }
                    else{
                        System.out.printf("%6d",start);
                        start++;
                    }
                    if(start > num){
                        break;
                    }
                }
                System.out.println();
            }
            System.out.println();
            if(i==1 || i==3 || i==5 || i==7 || i==8 || i==10 || i==12){
                day = (day + 31 % 7) % 7;
            }
            else if(i != 2){
                day = (day + 30 % 7) % 7;
            }
            if(i == 2 && ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0))) {
                day = (day + 29 % 7) % 7;
            }
        }

    }
}
