package zuoye_2;
public class test_5_25 {
    public static void main(String[] args) {
        double e;
        for (int i = 10000; i <=100000 ; i+=10000) {
            e = 0.0;
            for (int j = 1; j <= i; j++) {
                e = e + Math.pow(-1.0, (j + 1)) / (2 * j - 1);
            }
            System.out.println(4 * e);
        }
    }
}
