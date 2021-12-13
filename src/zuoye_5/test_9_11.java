package zuoye_5;

import java.util.Scanner;

public class test_9_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int d = input.nextInt();
        int e = input.nextInt();
        int f = input.nextInt();

        LinearEquation lin = new LinearEquation(a,b,c,d,e,f);

        boolean bool = lin.isSolvable();

        if(bool){
            System.out.println("x is " + lin.getX() + " and y is " + lin.getY());
        }
        else{
            System.out.println("The equation has no solution");
        }
    }
}

class LinearEquation{
    private double a,b,c,d,e,f;

    LinearEquation(double a,double b,double c,double d,double e,double f){
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
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

    double getD(){
        return d;
    }

    double getE(){
        return e;
    }

    double getF(){
        return f;
    }

    void setA(double a){
        this.a = a;
    }

    void setB(double b){
        this.b = b;
    }

    void setC(double c){
        this.c = c;
    }

    void setD(double d){
        this.d = d;
    }

    void setE(double e){
        this.e = e;
    }

    void setF(double f){
        this.f = f;
    }

    boolean isSolvable(){
        return (a * d - b * c) != 0;
    }

    double getX(){
        return (e * d - b * f) / (a * d - b * c);
    }

    double getY(){
        return (a * f - e * c) / (a * d - b * c);
    }
}