package zuoye_7;

import java.util.ArrayList;
import java.util.Scanner;

public class test_11_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer m:");
        int m = input.nextInt();
        int M = m;
        int n;
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 2; m > 1; i++) {
            if(m % i == 0){
                list.add(i);
                m /= i;
                i =1;
            }
        }
        n = slc(list);
        System.out.println("The smallest number n for m * n to be a perfect square is " + n +"\nm*n is "+M*n);
    }

    public static int slc(ArrayList<Integer> list){
        int mul = 1;
        for (int i = 0; i < list.size(); i++) {
            for (int j = i+1; j < list.size(); j++) {
                if(list.get(i) == (list.get(j))){
                    list.remove(j);
                    list.remove(i);
                    j--;
                }
            }
        }
        for (Integer integer : list) {
            mul *= integer;
        }
        return mul;
    }
}
