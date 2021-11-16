package zuoye_2;

public class zuoye_5_17 {
    public static void main(String[] args) {
        double money = 10000;
        double sum = 0;
        int i = 0;
        while (i < 10){
            money = money + money * 0.05;
            i++;
        }
        i = 0;
        while(i < 4){
            sum = sum + money;
            money = money + money * 0.05;
            i++;
        }
        System.out.printf("十年后学费:%.2f\n", money);
        System.out.printf("4年内总学费:%.2f", sum);
    }
}
