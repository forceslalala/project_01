package zuoye_7;

import java.util.ArrayList;
import java.util.Scanner;

public class test_11_19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of the objects:");
        int num = input.nextInt();
        int total;
        int Size = 0;

        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        System.out.print("Enter the weights of the objects:");
        for (int i = 0; i < num; i++) {
            list.add(input.nextInt());
        }

        while(list.size() != 0){
            total = list.get(0);
            list1.add(list.get(0));
            Size++;
            for (int j = 1; j < list.size(); j++) {
                if((total + list.get(j)) <= 10){
                    list1.add(list.get(j));
                    total += list.get(j);
                    list.remove(j);
                    j--;
                }
            }
            System.out.print("Contain " + Size + " contains the objects with weight ");
            for (Integer weight: list1) {
                System.out.print(weight + " ");
            }
            System.out.println();
            list1.clear();
            list.remove(0);
        }

    }
}
