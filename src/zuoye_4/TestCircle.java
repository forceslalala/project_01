package zuoye_4;

public class TestCircle {
    public static void main(String[] args) {
        Circle_1 circle1 = new Circle_1();
        System.out.println("The area of the circle of radius "
                + circle1.radius + " is " + circle1.getArea());

        Circle_1 circle2 = new Circle_1(25);
        System.out.println("The area of the circle of radius "
                + circle2.radius + " is " + circle2.getArea());

        Circle_1 circle3 = new Circle_1(125);
        System.out.println("The area of the circle of radius "
                + circle3.radius + " is " + circle3.getArea());

        circle2.radius = 100;
        System.out.println("The area of the circle of radius "
                + circle2.radius + " is " + circle2.getArea());
    }
}

class Circle_1 {
    double radius;

    Circle_1(){
        radius = 1;
    }

    Circle_1(double newRadius){
        radius = newRadius;
    }

    double getArea(){
        return radius * radius * Math.PI;
    }

    double getPerimeter(){
        return 2 * radius * Math.PI;
    }

    void setRadius(double newRadius){
        radius = newRadius;
    }
}