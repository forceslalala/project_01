package zuoye_5;

import java.util.Scanner;

public class test_9_10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        QuadraticEquation qua = new QuadraticEquation(a, b, c);

        double judge = qua.getDiscriminant();

        if(judge == 0){
            System.out.println(qua.getRoot1());
        }
        else if(judge > 0){
            System.out.println(qua.getRoot1() + " " + qua.getRoot2());
        }
        else{
            System.out.println("The equation has no root.");
        }
    }
}

class QuadraticEquation{
    private int a, b, c;

    QuadraticEquation (int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    double getA(){
        return a;
    }

    double getB(){
        return b;
    }

    double getC(){
        return c;
    }

    double getDiscriminant(){
        return b * b - 4 * a * c;
    }

    double getRoot1(){
        if(getDiscriminant() >= 0){
            return (-b + Math.sqrt(getDiscriminant())) / 2 * a;
        }
        else{
            return 0;
        }
    }

    double getRoot2(){
        if(getDiscriminant() >= 0){
            return (-b - Math.sqrt(getDiscriminant())) / 2 * a;
        }
        else{
            return 0;
        }
    }
}