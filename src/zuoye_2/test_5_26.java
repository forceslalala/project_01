package zuoye_2;

public class test_5_26 {
    public static void main(String[] args) {
        double e, item;

        for (int i = 10000; i <= 100000; i+=10000) {
            e = 1.0;
            item = 1.0;
            for (int j = 1; j <= i; j++) {
                item = item / j;
                e = e + item;
            }
            System.out.println(e);
        }
    }
}
