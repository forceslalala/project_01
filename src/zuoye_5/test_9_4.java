package zuoye_5;

import java.util.Random;

public class test_9_4 {
    public static void main(String[] args) {
        Random num = new Random(1000);
        for (int i = 0; i < 50; i++) {
            System.out.print(num.nextInt(100) + " ");
        }
    }
}
