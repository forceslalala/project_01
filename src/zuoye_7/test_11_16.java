package zuoye_7;

import java.util.ArrayList;
import java.util.Scanner;

public class test_11_16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Addition addition = new Addition();

        addition.question();
        int answer = input.nextInt();
        while(addition.getKey() != answer){
            addition.judge(answer);
            answer = input.nextInt();
        }
        System.out.println("You got it!");
    }
}

class Addition{
    private int number1;
    private int number2;
    private int key;
    private ArrayList<Integer> answer = new ArrayList<>();


    public Addition(){
    }

    public void setNum(){
        this.number1 = (int)(Math.random() * 10);
        this.number2 = (int)(Math.random() * 10);
        this.key = this.number1 + this.number2;
    }

    public int getKey(){
        return key;
    }

    public void question(){
        setNum();
        System.out.print("What is " + number1 + " + " + number2 + "? ");
    }

    public void judge(int answer) {
            if (this.answer.contains(answer)) {
                System.out.println("you already entered " + answer);
            }
            else {
                this.answer.add(answer);
            }
            System.out.print("Wrong answer. Try again. what is " + number1 + " + " + number2 + "? ");

    }


}
