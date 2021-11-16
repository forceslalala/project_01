package zuoye_2;

public class test_5_19 {
    public static void main(String[] args) {
        for (int i = 0; i < 8; i++) {
            for (int j = -7; j < 8; j++) {
                if(Math.abs(j) <= i){
                    System.out.printf("%4d",(int)Math.pow(2,(i-Math.abs(j))));
                }
                else{
                    System.out.print("    ");
                }
            }
            if(i!=7){
                System.out.println();
            }
        }
    }
}
