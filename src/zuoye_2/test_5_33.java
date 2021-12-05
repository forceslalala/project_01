package zuoye_2;

public class test_5_33 {
    public static void main(String[] args) {
        int num;
        for (int i = 1; i <= 10000; i++) {
            num = 0;
            for (int j = 1; j <= i/2; j++) {
                if(i%j == 0){
                    num += j;
                }
            }
            if (num == i){
                System.out.println(i);
            }
        }
    }
}
