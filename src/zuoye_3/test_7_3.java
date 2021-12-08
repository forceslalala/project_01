package zuoye_3;
import java.util.Scanner;
public class test_7_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] count = new int[101];
        int num;
        System.out.print("Enter the integers between 1 and 100:");
        num = input.nextInt();
        while(num != 0){
            count[num]++;
            num = input.nextInt();
        }
        for(int i = 1; i <= 100; i++){
            if(count[i] != 0){
                System.out.println(i + " occurs " + count[i] + " times");
            }
        }
    }
}
