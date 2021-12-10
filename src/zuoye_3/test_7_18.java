package zuoye_3;

public class test_7_18 {
    public static void main(String[] args) {
        int[] num = {1,2,3,0,9,10,5,4,6,8,7};
        int tem;
        int len = num.length;
        for (int i = 0; i <= len-2; i++) {
            for (int j = 0; j <= len-2-i; j++) {
                if (num[j] > num[j+1]){
                    tem = num[j];
                    num[j] = num[j+1];
                    num[j+1] = tem;
                }
            }
        }
        for (int i : num) {
            System.out.print(i + " ");
        }
    }
}
