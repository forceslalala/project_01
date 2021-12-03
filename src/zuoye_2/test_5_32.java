package zuoye_2;
import java.util.Scanner;
import java.util.Random;
public class test_5_32 {
    public static void main(String[] args) {
        Random rand = new Random();
        int lottery1 = rand.nextInt(9) + 1;
        int lottery2 = rand.nextInt(10);
        int lottery = lottery1 * 10 + lottery2;
        while(lottery1 == lottery2){
            lottery2 = rand.nextInt(10);
        }

        Scanner input = new Scanner(System.in);
        System.out.print("Enter your lottery pick (two digits):");
        int guess = input.nextInt();
        int guess1 = guess / 10;
        int guess2 = guess % 10;
        System.out.println("The lottery number is: " + lottery);

        if(guess == lottery){
            System.out.println("Exact match: you win $10,000");
        }
        else if(guess1 == lottery2 && guess2 == lottery1) {
            System.out.println("Match all digits: you win $3,000");
        }
        else if(guess2 == lottery1
                ||guess1 == lottery2
                ||guess1 == lottery1
                ||guess2 == lottery2){
            System.out.println("Match one digit: you win $1,000");
        }
        else{
            System.out.print("Sorry, no match");
        }

    }
}
