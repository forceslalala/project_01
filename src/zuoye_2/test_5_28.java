package zuoye_2;

import java.util.Scanner;
public class test_5_28 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("输入年份和第一天是周几数字：");
        int year = input.nextInt();
        int day = input.nextInt();
        for (int i = 1; i <= 12; i++) {
            switch (i){
                case 1: System.out.print("January 1, ");break;
                case 2: System.out.print("February 1, ");break;
                case 3: System.out.print("March 1, ");break;
                case 4: System.out.print("April 1, ");break;
                case 5: System.out.print("May 1, ");break;
                case 6: System.out.print("June 1, ");break;
                case 7: System.out.print("July 1, ");break;
                case 8: System.out.print("August 1, ");break;
                case 9: System.out.print("September 1, ");break;
                case 10: System.out.print("October 1, ");break;
                case 11: System.out.print("November 1, ");break;
                case 12: System.out.print("December 1, ");break;
            }
            switch (day){
                case 1: System.out.println(year + " is Monday");break;
                case 2: System.out.println(year + " is Tuesday");break;
                case 3: System.out.println(year + " is Wednesday");break;
                case 4: System.out.println(year + " is Thursday");break;
                case 5: System.out.println(year + " is Friday");break;
                case 6: System.out.println(year + " is Saturday");break;
                case 7: System.out.println(year + " is Sunday");break;
            }
            if(i==1 || i==3 || i==5 || i==7 || i==8 || i==10 || i==12){
                day = (day + 31 % 7) % 7;
            }
            else if(i != 2){
                day = (day + 30 % 7) % 7;
            }
            if(i == 2 && ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0))){
                day = (day + 29 % 7) % 7;
            }
        }
    }
}
